package es.uniovi.dlp.ast.expressions;

public class IntLiteral implements Expression {

    private int value;
    private int line;
    private int column;

    public IntLiteral(int line, int column, int value)
    {
        this.line=line;
        this.column=column;
        this.value=value;
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
