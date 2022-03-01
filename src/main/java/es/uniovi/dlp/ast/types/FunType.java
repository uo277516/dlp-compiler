package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.VarDef;

import java.util.List;

public class FunType implements Type{

    private List<VarDef> params;
    private Type returnType;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
