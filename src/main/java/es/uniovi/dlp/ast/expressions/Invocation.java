package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.Variable;

import java.util.List;

public class Invocation implements Expression {

    private Variable name;
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
