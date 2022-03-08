package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class IfElse extends AbstractStatemment {
    private List<Expression> condiciones;
    private List<Statemment> ifSts;
    private List<Statemment> elseSts;

    public IfElse(List<Expression> condiciones, List<Statemment> ifSts, List<Statemment> elseSts, int line, int column) {
        super(line, column);
        this.condiciones = condiciones;

        this.ifSts = ifSts;

        this.elseSts = elseSts;
    }


}
