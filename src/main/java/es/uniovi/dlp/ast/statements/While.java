package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class While extends AbstractStatemment {
    private List<Expression> condiciones;
    private List<Expression> exps;
    private List<Statemment> sts;
    public While(List<Expression> condiciones, List<Expression> exps, List<Statemment> sts, int line, int column) {
        super(line, column);
        this.condiciones = condiciones;
        this.exps = exps;
        this.sts = sts;
    }

    public List<Expression> getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(List<Expression> condiciones) {
        this.condiciones = condiciones;
    }

    public List<Expression> getExps() {
        return exps;
    }

    public void setExps(List<Expression> exps) {
        this.exps = exps;
    }

    public List<Statemment> getSts() {
        return sts;
    }

    public void setSts(List<Statemment> sts) {
        this.sts = sts;
    }
}
