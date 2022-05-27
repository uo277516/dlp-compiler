package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntType extends AbstractType{
    public IntType(int line, int column) {
        super(line, column);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }


    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public int getNumberOfBytes() {
        return 2;
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    //en int, si es char o int return this, si es double doubletype.geetinstance sino return uper.arithmeti
    @Override
    public Type arithmetic(Type type) {
        if (type instanceof CharType || type instanceof IntType) {
            return type;
        } else if (type instanceof RealType) {
            return new RealType(type.getLine(), type.getColumn());
        } else
            return super.arithmetic(type);
    }

    //Cambio examen, la comparacion devuelve booleano

    @Override
    public Type comparison(Type t) {
        if (t instanceof RealType || t instanceof IntType || t instanceof CharType) {
            //return new IntType(t.getLine(), t.getColumn());
            return new BooleanType(t.getLine(), t.getColumn());
        }

        return super.comparison(t);
    }

    @Override
    public Type logical(Type t) {
        //if (t.isLogical())
          //  return new IntType(t.getLine(), t.getColumn());

        return null;
    }

    @Override
    public boolean isIndexable() {
        return false;
    }

    @Override
    public boolean promotableTo(Type t) {
        if (t instanceof RealType || t instanceof IntType || t instanceof ErrorType) {
            return true;
        }
        return false;
    }


    @Override
    public Type cast(Type t) {
        if (t instanceof RealType || t instanceof IntType || t instanceof CharType)
            return t;
        return null;
    }






}
