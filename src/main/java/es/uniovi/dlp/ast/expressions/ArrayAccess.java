package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ArrayAccess extends AbstractExpression{

    private Expression index;
    private Expression array;

    public ArrayAccess(int line, int column, Expression index, Expression array)
    {
        super(line, column);
        super.setLvalue(true);
        this.index=index;
        this.array=array;
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+array);

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

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
