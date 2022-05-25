package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ArrayType extends AbstractType {
    private Type type;
    private int size;

    public ArrayType (int line, int column, Type type, int size)
    {
        super(line,column);
        this.type=type;
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }


    //Es si puede ser accedido por algo. Solo por int
    @Override
    public Type indexing(Type type) { //this es el vector y type es el indice.
       if (type instanceof IntType) {
           return this.getType();
       }
       return null;
    }


    @Override
    public boolean isIndexable() {
        return true;
    }

    @Override
    public int getNumberOfBytes() {
        return this.type.getNumberOfBytes()*size;
    }

    @Override
    public Type cast(Type from) { //this es el tipo de la expression y from tipo a castear
        return null;
    }


}
