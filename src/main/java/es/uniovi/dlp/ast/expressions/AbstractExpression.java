package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;

public abstract class AbstractExpression implements Expression {
    private int line;
    private int column;
    private boolean lvalue;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isLvalue() {
        return lvalue;
    }

    public void setLvalue(boolean lvalue) {
        this.lvalue = lvalue;
    }

    public AbstractExpression(int line, int column) {
        this.line=line;
        this.column=column;
    }
}
