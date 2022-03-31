package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractExpression implements Expression {
    private int line;
    private int column;
    private boolean lvalue;

    private Type type;

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }


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

    @Override
    public boolean getLValue() {
        return lvalue;
    }

    @Override
    public void setLValue(boolean lvalue) {
        this.lvalue=lvalue;
    }
}
