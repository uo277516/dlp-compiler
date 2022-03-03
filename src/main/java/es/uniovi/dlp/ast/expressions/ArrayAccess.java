package es.uniovi.dlp.ast.expressions;

public class ArrayAccess implements Expression{

    private Expression index;
    private Expression array;
    private int line;
    private int column;

    public ArrayAccess(int line, int column, Expression index, Expression array)
    {
        this.line=line;
        this.column=column;
        this.index=index;
        this.array=array;
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
