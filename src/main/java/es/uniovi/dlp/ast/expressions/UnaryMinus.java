package es.uniovi.dlp.ast.expressions;

public class UnaryMinus extends AbstractExpression {
    private Expression expression;

    public UnaryMinus(int line, int column, Expression e)
    {
        super(line, column);
        this.expression=e;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
