package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.types.Type;

public class VarDef implements Definition {

    private String id;
    private Type type;

    private int line;
    private int column;

    public VarDef ( int line, int column ,
                    String id, Type type)
    {
        this.line=line;
        this.column=column;
        this.id=id;
        this.type=type;
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
