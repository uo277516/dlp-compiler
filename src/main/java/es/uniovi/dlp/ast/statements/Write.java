package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class Write extends AbstractStatemment {
    private List<Expression> expressions;

    public Write (int line, int column, List<Expression> expressions)
    {
        super(line,column);
        this.expressions=expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
}
