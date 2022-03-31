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
    public Type arithmetic(Type type) {
        if (type instanceof IntType || type instanceof  RealType)
            return type;
        return super.arithmetic(type);
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }
}
