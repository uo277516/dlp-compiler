package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.expressions.Expression;

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
        this.field = field;
        this.expression = expression;

    }



}
