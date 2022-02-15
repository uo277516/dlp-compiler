package es.uniovi.dlp.ast.expressions.arithmetics;

import es.uniovi.dlp.ast.expressions.Expression;

public class Arithmetic implements Expression {

    private String operator;
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

