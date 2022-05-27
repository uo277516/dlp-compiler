package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class BooleanType extends AbstractType {

    public BooleanType(int line, int column) {
        super(line, column);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    @Override
    public int getNumberOfBytes() {
        return 2;
    }

    @Override
    public Type logical(Type type) {
        if (type instanceof BooleanType) {
            return type;
        }
        return null;
    }

    @Override
    public boolean promotableTo(Type t) {
        if(t instanceof BooleanType) {
            return true;
        }
        return false;
    }


}
