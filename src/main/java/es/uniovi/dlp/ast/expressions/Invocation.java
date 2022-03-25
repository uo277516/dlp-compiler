package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statemment;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class Invocation extends AbstractExpression implements Statemment {

    private Variable function;
    private List<Expression> params;

    public Invocation(int line, int column, Variable function, List<Expression> params) {
        super(line, column);
        super.setLvalue(false);
        this.function = function;
        this.params = params;
    }

    public Variable getVariable() {
        return function;
    }

    public void setVariable(Variable function) {
        this.function = function;
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
