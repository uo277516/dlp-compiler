package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class IfElse extends AbstractStatemment {
    private List<Expression> condiciones;
    private List<Expression> ifExps;
    private List<Statemment> ifSts;
    private List<Expression> elseExps;
    private List<Statemment> elseSts;

    public IfElse(List<Expression> condiciones, List<Expression> ifExps, List<Statemment> ifSts, List<Expression> elseExps, List<Statemment> elseSts, int line, int column) {
        super(line, column);
        this.condiciones = condiciones;
        this.ifExps = ifExps;
        this.ifSts = ifSts;
        this.elseExps = elseExps;
        this.elseSts = elseSts;
    }


}
