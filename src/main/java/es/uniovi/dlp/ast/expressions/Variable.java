package es.uniovi.dlp.ast.expressions;

public class Variable extends AbstractExpression {
    private String var;

    public Variable (int line, int column, String var) {
        super(line, column);
        this.var=var;
    }



}
