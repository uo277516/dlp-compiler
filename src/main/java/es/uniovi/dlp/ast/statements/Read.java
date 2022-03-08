package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class Read  extends AbstractStatemment {
    private Expression expression;

    public Read (int line, int column, Expression expression)
    {
        super(line, column);
        this.expression=expression;
    }

}
