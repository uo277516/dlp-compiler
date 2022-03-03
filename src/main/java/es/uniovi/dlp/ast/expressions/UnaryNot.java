package es.uniovi.dlp.ast.expressions;

public class UnaryNot implements Expression {
    private Expression expression;
    private int line;
    private int column;

    public UnaryNot(int line, int column, Expression e)
    {
        this.line=line;
        this.column=column;
        this.expression=e;
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
