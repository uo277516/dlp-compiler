package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statemment;

import java.util.List;

public class Invocation extends AbstractExpression implements Statemment {

    private Expression expression;
    private List<Expression> params;

    public Invocation(int line, int column, Expression expression, List<Expression> params) {
        super(line, column);
        this.expression = expression;
        this.params = params;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Expression> getParams() {
        return params;
    }

    public void setParams(List<Expression> params) {
        this.params = params;
    }
}
