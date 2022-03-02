package es.uniovi.dlp.ast.expressions;

import java.util.List;

public class Invocation implements Expression {

    private String name;
    private List<Expression> args;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
