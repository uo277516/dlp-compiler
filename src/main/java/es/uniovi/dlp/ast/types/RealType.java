package es.uniovi.dlp.ast.types;

public class RealType implements Type{
    private int line;
    private int column;
    public RealType(int line, int column) {
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
