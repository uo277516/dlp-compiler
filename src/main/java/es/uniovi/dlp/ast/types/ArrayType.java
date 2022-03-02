package es.uniovi.dlp.ast.types;

public class ArrayType implements Type {
    private int line;
    private int column;
    private Type type;

    public ArrayType (int line, int column, Type type)
    {
        this.line=line;
        this.column=column;
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
