package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

public class Cast implements Expression {
    private Type typeToCast;
    private Expression expression;
    private int line;
    private int column;

    public Cast(int line, int column, Expression e, Type t)
    {
        this.line=line;
        this.column=column;
        this.expression=e;
        this.typeToCast=t;
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
