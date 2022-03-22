package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statemment;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class Invocation extends AbstractExpression implements Statemment {

    private Expression expression;
    private List<Expression> params;

    public Invocation(int line, int column, Expression expression, List<Expression> params) {
        super(line, column);
        super.setLvalue(true);
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

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
