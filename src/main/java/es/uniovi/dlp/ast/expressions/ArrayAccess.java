package es.uniovi.dlp.ast.expressions;

public class ArrayAccess implements Expression{

    private Expression index;
    private Expression array;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
