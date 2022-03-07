package es.uniovi.dlp.ast.expressions;

public class ArrayAccess extends AbstractExpression{

    private Expression index;
    private Expression array;

    public ArrayAccess(int line, int column, Expression index, Expression array)
    {
        super(line, column);
        this.index=index;
        this.array=array;
    }


    public Expression getIndex() {
        return index;
    }

    public void setIndex(Expression index) {
        this.index = index;
    }

    public Expression getArray() {
        return array;
    }

    public void setArray(Expression array) {
        this.array = array;
    }
}
