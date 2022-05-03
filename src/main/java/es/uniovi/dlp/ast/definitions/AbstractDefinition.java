package es.uniovi.dlp.ast.definitions;


public abstract class AbstractDefinition implements Definition {
    private int line;
    private int column;
    private int scope;

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

    @Override
    public int getScope() {
        return this.scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope=scope;
    }


}
