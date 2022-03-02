package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class Write implements Statemment {
    private List<Expression> expressions;
    private int line;
    private int column;

    public Write (int line, int column, List<Expression> expressions)
    {
        this.line=line;
        this.column=column;
        this.expressions=expressions;
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
