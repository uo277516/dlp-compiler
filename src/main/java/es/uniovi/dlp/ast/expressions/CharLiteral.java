package es.uniovi.dlp.ast.expressions;

public class CharLiteral implements Expression{

    private char value;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
