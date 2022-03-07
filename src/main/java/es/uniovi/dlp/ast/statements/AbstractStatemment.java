package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public abstract class AbstractStatemment implements Statemment {

    private int line;
    private int column;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public AbstractStatemment(int line, int column) {
        this.line=line;
        this.column=column;
    }
}
