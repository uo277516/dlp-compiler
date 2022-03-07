package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.VarDef;

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

}
