package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.expressions.Expression;

public class Logical extends AbstractExpression {
    private Expression left;
    private String operator;

    public Logical(Expression left, String operator, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    private Expression right;

}
