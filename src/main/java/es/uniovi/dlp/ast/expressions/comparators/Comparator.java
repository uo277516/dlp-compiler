package es.uniovi.dlp.ast.expressions.comparators;

import es.uniovi.dlp.ast.expressions.Expression;

public class Comparator implements Expression {
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
