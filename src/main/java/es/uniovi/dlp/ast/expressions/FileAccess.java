package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.expressions.Expression;

public class FileAccess extends AbstractExpression{

    private Expression field;
    private Expression expression;

    public Expression getField() {
        return field;
    }

    public void setField(Expression field) {
        this.field = field;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public FileAccess(Expression field, Expression expression, int line, int column) {
        super(line, column);
        this.field = field;
        this.expression = expression;

    }



}
