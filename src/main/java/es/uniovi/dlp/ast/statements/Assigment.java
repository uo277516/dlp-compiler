package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public class Assigment implements Statemment {

    private Expression left;
    private Expression right;

    private int line;
    private int column;

    public Assigment( int line, int column,Expression left, Expression right) {
        this.left = left;
        this.right = right;
        this.line = line;
        this.column = column;
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
