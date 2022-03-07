package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class Read  extends AbstractStatemment {
    private List<Expression> expressions;

    public Read (int line, int column, List<Expression> expressions)
    {
        super(line, column);
        this.expressions=expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
}
