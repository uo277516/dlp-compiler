package es.uniovi.dlp.ast.types;

public class IntType implements Type{
    private int line;
    private int column;
    public IntType(int line, int column) {
        this.line=line;
        this.column=column;
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
