package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Variable extends AbstractExpression {
    private String var;
    private Definition definition;

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public Variable (int line, int column, String var, Definition def) {
        super(line, column);
        super.setLvalue(true);
        this.var=var;
        this.definition=def;
    }

    public String getVar() {
        return var;
    }
    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
