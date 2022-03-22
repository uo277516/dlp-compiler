package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Cast extends AbstractExpression {
    private Type typeToCast;
    private Expression expression;

    public Cast(int line, int column, Expression e, Type t)
    {
        super(line, column);
        super.setLvalue(false);
        this.expression=e;
        this.typeToCast=t;
    }

    public Type getTypeToCast() {
        return typeToCast;
    }

    public void setTypeToCast(Type typeToCast) {
        this.typeToCast = typeToCast;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
