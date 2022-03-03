package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class While implements Statemment {
    private List<Expression> condiciones;
    private List<Expression> exps;
    private List<Statemment> sts;
    private int line;
    private int column;

    public While(List<Expression> condiciones, List<Expression> exps, List<Statemment> sts, int line, int column) {
        this.condiciones = condiciones;
        this.exps = exps;
        this.sts = sts;
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
