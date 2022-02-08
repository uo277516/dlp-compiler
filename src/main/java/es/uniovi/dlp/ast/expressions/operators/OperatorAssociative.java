package es.uniovi.dlp.ast.expressions.operators;

import es.uniovi.dlp.ast.expressions.Expression;

public abstract class OperatorAssociative {
    private Expression rightExp;
    private Expression leftExpression;
    private String operator;
}
