package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Arithmetic extends AbstractExpression {


    private Expression left;
    private String operator;

    public Arithmetic(Expression left, String operator, Expression right, int line, int column) {
        super(line, column);
        super.setLvalue(true);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    private Expression right;

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

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}

