package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Type, Type> {

    private CodeGenerator codeGenerator;
    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cg){

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
            if(def instanceof VarDef)
                def.accept(this, param);
        //Segundo, el main
        codeGenerator.comment("Invocation to the main function");
        codeGenerator.call("main");
        codeGenerator.halt();
        //Tercero las funciones
        for(Definition def : program.getDefinitions())
            if(def instanceof FunDef)
                def.accept(this, param);
        return null;
    }
}
