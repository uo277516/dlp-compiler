package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public class Return implements Statemment {

    private Expression expression;
    private int line;
    private int column;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public Return(Expression expression, int line, int column) {
        this.expression = expression;
        this.line = line;
        this.column = column;
    }
}
