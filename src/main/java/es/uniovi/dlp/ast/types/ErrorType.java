package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ErrorType extends AbstractType {

    public ErrorType(int line, int column) {
        super(line, column);
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    @Override
    public boolean isLogical() {
        System.out.println("entra islogical del errortypr");
        return true;
    }

    @Override
    public int getNumberOfBytes() {
        return 0;
    }
}
