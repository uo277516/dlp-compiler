package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class While extends AbstractStatemment {
    private Expression condicion;
    private List<Statemment> sts;
    public While(Expression condicion, List<Statemment> sts, int line, int column) {
        super(line, column);
        this.condicion = condicion;
        this.sts = sts;
    }

    public Expression getCondicion() {
        return condicion;
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
