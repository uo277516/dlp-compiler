package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class FunType extends AbstractType{

    private List<VarDef> params;
    private Type returnType;

    public List<VarDef> getParams() {
        return params;
    }

    public void setParams(List<VarDef> params) {
        this.params = params;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public FunType(List<VarDef> params, Type returnType, int line, int column) {
        super(line,column);
        this.params = params;
        this.returnType = returnType;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    @Override
    public int getNumberOfBytes() {
        int bytes = 0;
        for(VarDef v : params)
            bytes += v.getType().getNumberOfBytes();

        return bytes;
    }

    @Override
    public boolean isLogical() {
        if (this.returnType instanceof IntType) return true;
        return false;
    }

    @Override
    public String toString() {
        return "FunType{" +
                "params=" + params +
                ", returnType=" + returnType +
                '}';
    }
}
