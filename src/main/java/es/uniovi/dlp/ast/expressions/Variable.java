package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Variable extends AbstractExpression {
    private String var;

    public Variable (int line, int column, String var) {
        super(line, column);
        this.var=var;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
