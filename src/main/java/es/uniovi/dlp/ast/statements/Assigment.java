package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public class Assigment extends AbstractStatemment {

    private Expression left;
    private Expression right;


    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Assigment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

}
