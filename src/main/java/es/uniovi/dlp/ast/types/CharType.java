package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharType extends AbstractType {

    public CharType(int line, int column) {
        super(line,column);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(Type t) {
        if(t instanceof RealType || t instanceof IntType)
            return t;
        else if(t instanceof CharType)
            return new IntType(super.getLine(),super.getColumn());

        return null;
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public Type comparison(Type t) {
        if (t instanceof RealType || t instanceof IntType || t instanceof CharType)
            return new IntType(super.getLine(),super.getColumn());

        return null;
    }

    @Override
    public Type logical(Type t) {
        if(t.isLogical())
            return new IntType(super.getLine(),super.getColumn());
        return null;
    }

    @Override
    public boolean promotableTo(Type t) {
        if(t instanceof RealType || t instanceof IntType || t instanceof CharType)
            return true;
        return false;
    }

    @Override
    public Type cast(Type t) {
        if(t instanceof RealType || t instanceof IntType || t instanceof CharType) {
            return t;
        }
        return null;
    }
}
