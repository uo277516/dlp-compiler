package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.types.FunType;
import es.uniovi.dlp.ast.types.StructType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Type, Type> {

    //tengo q implementar los q tengan vardefs o recordfields


    //Variables locales
    @Override
    public Type visit(Program program, Type param) {
        int offset = 0;
        for (var def: program.getDefinitions()) {
            def.accept(this,param);
            if (def instanceof VarDef) {
                ((VarDef) def).setOffset(offset);
                offset += def.getType().getNumberOfBytes();
            }
        }
        return null;
    }


    @Override
    public Type visit(FunDef fundef, Type param) {
        fundef.getType().accept(this, param);
        int offset = 0;
        for (var def: fundef.getLocalVars()) {
            def.accept(this, param);
            offset-=def.getType().getNumberOfBytes();
            def.setOffset(offset);
        }
        return null;
    }


    @Override
    public Type visit(StructType structType, Type param) {
        int offset = 0;
        for (var r : structType.getDefs()) {
            r.accept(this, param);
            r.setOffset(offset);
            offset += r.getType().getNumberOfBytes();
        }
        System.out.println("entra structype");
        return null;
    }


    @Override
    public Type visit(FunType f, Type param) {
        f.getReturnType().accept(this, param);

        int offset = 4;
        for(int i=f.getParams().size()-1 ; i>=0 ; i--){
            VarDef parameter = f.getParams().get(i);
            parameter.accept(this, param);
            parameter.setOffset(offset);
            offset+=parameter.getType().getNumberOfBytes();
        }
        System.out.println("entra funtype");
        return null;
    }



}
