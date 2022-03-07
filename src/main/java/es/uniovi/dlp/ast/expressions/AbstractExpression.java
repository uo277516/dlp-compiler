package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;

public abstract class AbstractExpression implements Expression {
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

    public AbstractExpression(int line, int column) {
        this.line=line;
        this.column=column;
    }
}
