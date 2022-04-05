package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class VarDef extends AbstractDefinition {

    private String id;
    private Type type;


    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    private int offset;


    public VarDef ( int line, int column ,
                    String id, Type type)
    {
        super(line, column);
        this.id=id;
        this.type=type;
    }

    public VarDef(int line, int column) {
        super(line,column);
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
