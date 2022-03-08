package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class Write extends AbstractStatemment {
    private Expression expression;

    public Write (int line, int column, Expression expression)
    {
        super(line,column);
        this.expression=expression;
    }

   // public void setExpressions(List<Expression> expressions) {
     //   this.expressions = expressions;
    //}
}
