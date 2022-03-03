package es.uniovi.dlp.ast.expressions;

import java.util.List;

public class Invocation implements Expression {

    private int line;
    private int column;
    private Expression expression;
    private List<Expression> params;

    public Invocation(int line, int column, Expression expression, List<Expression> params) {
        this.line = line;
        this.column = column;
        this.expression = expression;
        this.params = params;
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
