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







}
