package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class IfElse implements Statemment {
    private List<Expression> condiciones;
    private List<Expression> ifExps;
    private List<Statemment> ifSts;
    private List<Expression> elseExps;
    private List<Statemment> elseSts;
    private int line;
    private int column;

    public IfElse(List<Expression> condiciones, List<Expression> ifExps, List<Statemment> ifSts, List<Expression> elseExps, List<Statemment> elseSts, int line, int column) {
        this.condiciones = condiciones;
        this.ifExps = ifExps;
        this.ifSts = ifSts;
        this.elseExps = elseExps;
        this.elseSts = elseSts;
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
