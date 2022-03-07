package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public class Return extends AbstractStatemment {

    private Expression expression;



    public Return(Expression expression, int line, int column) {
        super(line,column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
