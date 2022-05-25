package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.RecordField;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.ArrayType;
import es.uniovi.dlp.ast.types.FunType;
import es.uniovi.dlp.ast.types.StructType;
import es.uniovi.dlp.ast.types.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.sql.Struct;
import java.util.List;

public class ExecuteCGVisitor extends AbstractVisitor<VoidType, Definition> {

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
    public VoidType visit(Program program, Definition param) {
        //Primero las vardefs
        for(var def : program.getDefinitions()) {
            if (def instanceof VarDef) {
                def.accept(this, param);
            }
        }
        codeGenerator.newLine();
        //Segundo, el main
        codeGenerator.comment("Invocation to the main function");
        codeGenerator.call("main");
        codeGenerator.halt();
        codeGenerator.newLine();

        //Cuarto las funciones
        for(var def : program.getDefinitions())
            if(def instanceof FunDef)
                def.accept(this, param);
        return null;
    }


    /**
     *execute [[ FuncDefinition : definition -> varDefinition* statement* ]]() =
     * 	<label>funcDefinition.getName()
     * 	for(VarDefinition param : obj.getType().getParams)
     * 	    execute[[definition]]
     * 	execute[[varDefinition*]]
     * 	<enter>vd.getType().numberOfBytes()
     * 	execute[[statement*]]
     * 	if(funcType.getType() instanceof Void)
     * 		<ret>0, funcDef.getTotalBytesLocales(), funcDef.getTotalBytesParams()
     *
     */
    @Override
    public VoidType visit(FunDef fundef, Definition param) {
        FunType type = (FunType) fundef.getType();
        int bytesLocales = 0;
        int bytesParams = 0;
        int bytesEnter = 0;
        codeGenerator.line(fundef.getLine());
        codeGenerator.newLine();
        codeGenerator.label(fundef.getId()); //<--
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
            s.accept(this, fundef);
        }
        FunType typeReturn = (FunType) fundef.getType();
        if(typeReturn.getReturnType() instanceof VoidType) {
            codeGenerator.ret(0, bytesLocales, bytesParams);
        }


        return null;
    }



    @Override
    public VoidType visit(VarDef def, Definition param) {

        codeGenerator.commentT( def.getId() + " :: " + codeGenerator.getTypeString(def.getType()) +
                    " (offset "+ def.getOffset() + ")");

        return null;
    }


    /**
     *execute [[ Assignment : statement -> expression1:expression expression2:expression ]]() =
     * 	address[[expression1]]
     * 	value[[expression2]]
     * 	<store>expression1.type.suffix()
     *
     */
    @Override
    public VoidType visit(Assigment assigment, Definition param) {
        assigment.getLeft().accept(addressCGVisitor, null);
        assigment.getRight().accept(valueCGVisitor, null);
        codeGenerator.convert(assigment.getRight().getType(), assigment.getLeft().getType());
        codeGenerator.store(assigment.getLeft().getType());
        return null;
    }

    /**
     *execute [[ Write : statement -> expression ]]() =
     * 	value[[expression]]()
     * 	<out>expression.type
     */
    @Override
    public VoidType visit(Write write, Definition param) {
        //codeGenerator.newLine();
        codeGenerator.commentT("Write");
        write.getExpression().accept(valueCGVisitor, null);
        //System.out.println(write.getExpression().getType());
        codeGenerator.out(write.getExpression().getType());

        return null;
    }

    /**
     *execute [[ Read : statement -> expression ]]() =
     * 	address[[expression]]()
     * 	<in>expression.type
     * 	<store>expression.type
     */
    @Override
    public VoidType visit(Read read, Definition param) {
        //codeGenerator.newLine();
        codeGenerator.commentT("Read");
        read.getExpression().accept(addressCGVisitor, null);
        codeGenerator.in(read.getExpression().getType());
        codeGenerator.store(read.getExpression().getType());
        return null;
    }


    //If y While

    /**
     *execute [[ IfElse : statement -> expression statementIf* statementElse* ]]() =
     *  int lastLabelId = codeGenerator.getLastLabelId();
     * 	value[[expression]]
     * 	<jz> "label"+lastLabelId
     * 	for(Statement stm : statementIf*)
     * 		execute[[stm]]
     * 	<jmp>  "label"+lastLabelId+1
     * 	<label>"label"+lastLabelId
     * 	for(Statement stm : statementElse*)
     *		execute[[stm]]
     * 	<label>"label"+lastLabelId+1
     *
     */
    @Override
    public VoidType visit(IfElse ifElse, Definition param) {
        int lastLabelId = codeGenerator.getLastLabelId();
        codeGenerator.allocateLabels(2);

        codeGenerator.commentT("If statement");
        ifElse.getCondicion().accept(valueCGVisitor, null);

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
     * 	int lastLabelId = cg.getLastLabelId();
     * 	<label> "label" + labelNumber
     * 	value[[expression]]
     * 	<jz> "label" + labelNumber+1
     * 	for(Statement statement : statement*)
     * 		execute[[statement]]()
     * 	<jmp> "label" + labelNumber
     * 	<label> "label" + labelNumber+1
     *
     */
    @Override
    public VoidType visit(While wh, Definition param) {
        int lastLabelId = codeGenerator.getLastLabelId();
        codeGenerator.allocateLabels(2);

        codeGenerator.commentT("While statement");
        codeGenerator.label("label"+lastLabelId);
        wh.getCondicion().accept(valueCGVisitor, null);

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

    //Return

    /**
     *execute[[Return : statement -> expression]](funcDefinition) =
     * 	value[[expression]]
     * 	<ret> expression.type.getNumberOfBytes() <, >
     * 		funcDefinition.getBytesLocales() <, >
     * 		funcDefinition.getBytesParams()
     *
     */
    @Override
    public VoidType visit(Return re, Definition param) {
        codeGenerator.commentT("Return");
        re.getExpression().accept(valueCGVisitor, null);
        FunDef f = (FunDef) param;
        FunType funtype = (FunType) f.getType();
        codeGenerator.ret(funtype.getReturnType().getNumberOfBytes(), f.getBytesLocales(), f.getBytesParams());

        return null;
    }

    /**
     *execute [[Invocation : statement -> expression expression*]]() =
     * 	value[[statement]]
     * 	if(statement.type instanceof Void == false)
     * 		<pop> statement.type.suffix
     *
     */
    @Override
    public VoidType visit(Invocation invocation, Definition param) {
        invocation.accept(valueCGVisitor, null);
        FunType f = (FunType) invocation.getType();
        if(f.getReturnType() instanceof VoidType == false)
            codeGenerator.pop(invocation.getType());
        return null;
    }


}
