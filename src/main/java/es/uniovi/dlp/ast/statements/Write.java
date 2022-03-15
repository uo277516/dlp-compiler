package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class Write extends AbstractStatemment {
    private Expression expression;

    public Write (int line, int column, Expression expression)
    {
        super(line,column);
        this.expression=expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    // public void setExpressions(List<Expression> expressions) {
     //   this.expressions = expressions;
    //}
}
