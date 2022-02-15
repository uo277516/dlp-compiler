package es.uniovi.dlp.ast.expressions.logical;

import es.uniovi.dlp.ast.expressions.Expression;

public class Logical implements Expression {
    private Expression left;
    private Expression right;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
