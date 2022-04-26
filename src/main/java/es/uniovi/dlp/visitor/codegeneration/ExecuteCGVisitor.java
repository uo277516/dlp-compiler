package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.statements.Assigment;
import es.uniovi.dlp.ast.statements.Read;
import es.uniovi.dlp.ast.statements.Write;
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




}
