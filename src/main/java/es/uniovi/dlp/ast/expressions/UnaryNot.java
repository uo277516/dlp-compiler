package es.uniovi.dlp.ast.expressions;

public class UnaryNot extends AbstractExpression{
    private Expression expression;


    public UnaryNot(int line, int column, Expression e)
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
