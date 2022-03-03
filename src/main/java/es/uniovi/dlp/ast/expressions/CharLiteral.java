package es.uniovi.dlp.ast.expressions;

public class CharLiteral implements Expression{

    private char value;
    private int line;
    private int column;

    public CharLiteral(int line, int column, char value)
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
