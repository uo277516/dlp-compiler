package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class While extends AbstractStatemment {
    private List<Expression> condiciones;
    private List<Statemment> sts;
    public While(List<Expression> condiciones, List<Statemment> sts, int line, int column) {
        super(line, column);
        this.condiciones = condiciones;
        this.sts = sts;
    }

    public List<Expression> getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(List<Expression> condiciones) {
        this.condiciones = condiciones;
    }





    public List<Statemment> getSts() {
        return sts;
    }

    public void setSts(List<Statemment> sts) {
        this.sts = sts;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
