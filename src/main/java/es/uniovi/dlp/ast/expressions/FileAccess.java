package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.expressions.Expression;

public class FileAccess implements Expression {

    private Expression field;
    private Expression expression;
    private int line;
    private int column;

    public FileAccess(Expression field, Expression expression, int line, int column) {
        this.field = field;
        this.expression = expression;
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

}
