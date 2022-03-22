package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class FileAccess extends AbstractExpression{

    private Expression field;
    private String expression;

    public Expression getField() {
        return field;
    }

    public void setField(Expression field) {
        this.field = field;
    }



    public FileAccess(Expression field, String expression, int line, int column) {
        super(line, column);
        super.setLvalue(true);
        this.field = field;
        this.expression = expression;

    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
