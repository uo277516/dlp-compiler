package es.uniovi.dlp.ast.types;

public abstract class AbstractType implements Type {
    private int line;
    private int column;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public AbstractType(int line, int column) {
        this.line=line;
        this.column=column;
    }


}
