package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.FunType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Type, Type> {

    private CodeGenerator codeGenerator;
    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cg){
        this.codeGenerator = cg;
        this.valueCGVisitor = new ValueCGVisitor(cg);
        this.addressCGVisitor = new AddressCGVisitor(valueCGVisitor, cg);
    }

    /**
     *execute [[ Program : program -> definition* ]]() =
     * 	for(Definition definition : definition*)
     * 		if(definition instanceof VarDefinition)
     * 			execute[[definition]]()
     *
     * 	<call main>
     * 	<halt>
     *
     * 	for(Definition definition : definition*)
     * 		if(definition instanceof FuncDefinition)
     * 			execute[[ definition ]]()
     *
     */
    @Override
    public Type visit(Program program, Type param) {
        //Primero las vardefs
        for(Definition def : program.getDefinitions())
            if(def instanceof VarDef) {
                def.accept(this, param);
            }
        codeGenerator.newLine();
        //Segundo, el main
        codeGenerator.comment("Invocation to the main function");
        codeGenerator.call("main");
        codeGenerator.halt();
        codeGenerator.newLine();

        //Cuarto las funciones
        for(Definition def : program.getDefinitions())
            if(def instanceof FunDef)
                def.accept(this, param);
        return null;
    }


    /**
     *execute [[ FuncDefinition : definition -> statement* varDefinition* ]]() =
     * 	<label>funcDefinition.getName()
     * 	for(VarDefinition vd : varDefinition*)
     * 		<enter>vd.getType().numberOfBytes()
     * 	execute[[statement*]]
     * 	if(funcType.getType() instanceof Void)
     * 		<ret>0, funcDef.getTotalBytesLocales(), funcDef.getTotalBytesParams()
     *
     */
    @Override
    public Type visit(FunDef fundef, Type param) {
        FunType type = (FunType) fundef.getType();
        int bytesLocales = 0;
        int bytesParams = 0;
        int bytesEnter = 0;
        codeGenerator.line(fundef.getLine());
        codeGenerator.newLine();
        codeGenerator.label(fundef.getId());
        codeGenerator.commentT("Parameters");
        for (var p: type.getParams()) {
            p.accept(this, param);
            bytesParams+=p.getType().getNumberOfBytes();
        }
        codeGenerator.commentT("Local variables");
        for(var vardef: fundef.getLocalVars()) {
            vardef.accept(this, param);
            bytesEnter+=vardef.getType().getNumberOfBytes();
            bytesLocales+=vardef.getType().getNumberOfBytes();
        }
        codeGenerator.enter(bytesEnter);

        for (var s: fundef.getBody()) {
            codeGenerator.line(s.getLine());
            s.accept(this, param);
        }
        FunType typeReturn = (FunType) fundef.getType();
        if(typeReturn.getReturnType() instanceof VoidType) {
            codeGenerator.ret(0, bytesLocales, bytesParams);
        }


        return null;
    }



    @Override
    public Type visit(VarDef def, Type param) {
        codeGenerator.commentT( def.getId() + " :: " + codeGenerator.getTypeString(def.getType()) +
                " (offset "+ def.getOffset() + ")");

        return null;
    }


    /**
     *execute [[ Assignment : statement -> expression expression ]]() =
     * 	address[[expression1]]
     * 	value[[expression2]]
     * 	<store>expression1.type.suffix()
     *
     */
    @Override
    public Type visit(Assigment assigment, Type param) {
        //codeGenerator.newLine();
        //codeGenerator.line(assigment.getLine());
        assigment.getLeft().accept(addressCGVisitor, param);
        assigment.getRight().accept(valueCGVisitor, param);
        codeGenerator.store(assigment.getLeft().getType());
        return null;
    }

    /**
     *execute [[ Write : statement -> expression ]]() =
     * 	value[[expression]]()
     * 	<out>expression.type.suffix()
     */
    @Override
    public Type visit(Write write, Type param) {
        //codeGenerator.newLine();
        codeGenerator.commentT("Write");
        write.getExpression().accept(valueCGVisitor, param);
        codeGenerator.out(write.getExpression().getType());

        return null;
    }

    /**
     *execute [[ Read : statement -> expression ]]() =
     * 	address[[expression]]()
     * 	<in>expression.type.suffix()
     * 	<store>expression.type.suffix()
     */
    @Override
    public Type visit(Read read, Type param) {
        //codeGenerator.newLine();
        codeGenerator.commentT("Read");
        read.getExpression().accept(addressCGVisitor, param);
        codeGenerator.in(read.getExpression().getType());
        codeGenerator.store(read.getExpression().getType());
        return null;
    }

    //if y while


    //etiqueta jmp condicionif 0 salta else. caso no es 0 (1) no hace jmp y al final del if jmpincondicional
    //al final de tod
    //estos dos pasos siguientes local
    //1. lastid (0 x ej)
    //allocate(2). el primero en en else (lastlabelid) y al final de tod lastlab+1
    //en el primer jmp a lastod y el siguiente jmp a +1
    /**
     *execute [[ IfElse : statement -> expression statementIf* statementElse* ]]() =
     * int numLabel = codeGenerator.getLabel();
     * 	value[[expression]]
     * 	<jz> "else"+numLabel
     * 	for(Statement stm : statementIf*)
     * 		execute[[stm]]
     * 	<jmp> "end"+numLabel
     * 	<label>"else"+numLabel
     * 	for(Statement stm : statementElse*)
     *		execute[[stm]]
     * 	<label>"end"+numLabel
     *
     */
    @Override
    public Type visit(IfElse ifElse, Type param) {
        int lastLabelId = codeGenerator.getLastLabelId();
        codeGenerator.allocateLabels(2);

        codeGenerator.commentT("If statement");
        ifElse.getCondicion().accept(valueCGVisitor, param);

        codeGenerator.jz("label"+lastLabelId);
        codeGenerator.commentT("Body of the if branch");
        for( Statemment s: ifElse.getIfSts()) {
            codeGenerator.line(s.getLine());
            s.accept(this, param);
        };

        codeGenerator.jmp("label"+(lastLabelId+1));
        codeGenerator.label("label"+lastLabelId);

        codeGenerator.commentT("Body of the else branch");
        for (Statemment s: ifElse.getElseSts()) {
            codeGenerator.line(s.getLine());
            s.accept(this, param);
        }

        codeGenerator.label("label"+(lastLabelId+1));
        return null;
    }


    /**
     *execute [[While : statement -> expression statement*]]() =
     * 	int labelNumber = cg.getLabel();
     * 	<label> "while" + labelNumber <:>
     * 	value[[expression]]()
     * 	<jz> "endWhile" + labelNumber
     * 	for(Statement statement : statement*)
     * 		execute[[statement]]()
     * 	<jmp> "while" + labelNumber
     * 	<label> "endWhile" + labelNumber <:>
     *
     */
    @Override
    public Type visit(While wh, Type param) {
        int lastLabelId = codeGenerator.getLastLabelId();
        codeGenerator.allocateLabels(2);

        codeGenerator.commentT("While statement");
        codeGenerator.label("label"+lastLabelId);
        wh.getCondicion().accept(valueCGVisitor, param);

        codeGenerator.jz("label"+(lastLabelId+1));
        codeGenerator.commentT("Body of the while statement");
        for( Statemment s: wh.getSts()) {
            codeGenerator.line(s.getLine());
            s.accept(this, param);
        }
        codeGenerator.jmp("label"+lastLabelId);
        codeGenerator.label("label"+(lastLabelId+1));

        return null;
    }
}
