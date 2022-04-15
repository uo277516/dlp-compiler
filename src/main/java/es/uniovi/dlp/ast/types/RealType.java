package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class RealType extends AbstractType{
    public RealType(int line, int column) {
        super(line, column);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }


    @Override
    public Type arithmetic(Type type) {
        if (type instanceof RealType || type instanceof CharType || type instanceof  IntType)
            return this;
        return super.arithmetic(type);
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public int getNumberOfBytes() {
        return 4;
    }


    @Override
    public Type comparison(Type t) {
        if (t instanceof RealType || t instanceof IntType || t instanceof CharType)
            return new IntType(super.getLine(), super.getColumn());

        return super.comparison(t);
    }

    @Override
    public Type indexing(Type type) {
        if (type instanceof IntType) {
            return this;
        }
        return null;
    }

    @Override
    public boolean promotableTo(Type t) {
        if (t instanceof RealType)
            return true;
        return super.promotableTo(t);
    }


    @Override
    public Type cast(Type t) {
        if (t instanceof RealType || t instanceof IntType || t instanceof CharType)
            return t;
        return null;
    }

}
