package es.uniovi.dlp.ast.types;

public class CharType implements Type {

    private int line;
    private int column;
    public CharType(int line, int column) {
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
