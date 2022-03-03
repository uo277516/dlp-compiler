package es.uniovi.dlp.ast.expressions;

public class RealLiteral implements Expression {

    private double value;
    private int line;
    private int column;

    public RealLiteral(int line, int column, double value)
    {
        this.line=line;
        this.column=column;
        this.value=value;
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
