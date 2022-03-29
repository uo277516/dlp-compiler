package es.uniovi.dlp.ast.types;

import com.sun.jdi.DoubleType;
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
        if (type instanceof IntType || type instanceof CharType)
            return this;
        return super.arithmetic(type);
    }
}
