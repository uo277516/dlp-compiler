package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class VoidType extends AbstractType {

    public VoidType(int line, int column) {
        super(line,column);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    @Override
    public int getNumberOfBytes() {
        return 0;
    }
}
