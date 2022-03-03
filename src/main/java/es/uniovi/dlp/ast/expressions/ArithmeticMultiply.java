package es.uniovi.dlp.ast.expressions;

public class ArithmeticMultiply implements Expression {


    private Expression left;
    private String operator;

    public ArithmeticMultiply(Expression left, String operator, Expression right, int line, int column) {
        this.left = left;
        this.operator = operator;
        this.right = right;
        this.line = line;
        this.column = column;
    }

    private Expression right;
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
}

