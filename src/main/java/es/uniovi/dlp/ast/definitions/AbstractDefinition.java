package es.uniovi.dlp.ast.definitions;


public class AbstractDefinition implements Definition {
    private int line;
    private int column;

    public AbstractDefinition(int line, int column)
    {
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
