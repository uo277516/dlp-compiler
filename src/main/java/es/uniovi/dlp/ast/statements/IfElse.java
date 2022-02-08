package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class IfElse implements Statemment {
    private Expression condition;
    private List<Statemment> ifBody;
    private List<Statemment> elseBody;
}
