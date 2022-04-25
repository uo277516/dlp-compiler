package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class FieldAccess extends AbstractExpression{

    private Expression field;
    private String expression;

    public Expression getField() {
        return field;
    }

    public void setField(Expression field) {
        this.field = field;
    }



    public FieldAccess(Expression field, String expression, int line, int column) {
        super(line, column);
        super.setLvalue(true);
        this.field = field;
        this.expression = expression;

    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
