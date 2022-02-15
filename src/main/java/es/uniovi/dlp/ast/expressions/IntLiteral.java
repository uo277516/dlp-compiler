package es.uniovi.dlp.ast.expressions;

public class IntLiteral implements Expression {

    private int value;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
