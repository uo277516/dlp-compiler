package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.VarDef;

import java.util.List;

public class FunType implements Type{

    private List<VarDef> params;
    private Type returnType;
    private int line;
    private int column;

    public FunType(List<VarDef> params, Type returnType, int line, int column) {
        this.params = params;
        this.returnType = returnType;
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
