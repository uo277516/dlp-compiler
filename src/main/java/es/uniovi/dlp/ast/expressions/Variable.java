package es.uniovi.dlp.ast.expressions;

public class Variable implements Expression {
    private int line;
    private int column;
    private String var;

    public Variable (int line, int column, String var) {
        this.line=line;
        this.column=column;
        this.var=var;
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
