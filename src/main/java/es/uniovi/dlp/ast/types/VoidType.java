package es.uniovi.dlp.ast.types;

public class VoidType implements Type {


    private int line;
    private int column;
    public VoidType(int line, int column) {
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
