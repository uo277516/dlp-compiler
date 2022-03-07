package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.expressions.Expression;

public class Comparator extends AbstractExpression {
    private Expression left;
    private String operator;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Comparator(Expression left, String operator, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.operator = operator;
        this.right = right;

    }

    private Expression right;

}
