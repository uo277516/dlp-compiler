package es.uniovi.dlp.ast.types;

public class ArrayType extends AbstractType {
    private Type type;

    public ArrayType (int line, int column, Type type)
    {
        super(line,column);
        this.type=type;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
