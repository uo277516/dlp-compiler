package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statemment;
import es.uniovi.dlp.ast.types.FunType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;


public class FunDef extends AbstractDefinition {

    private String id;
    private Type type;
    private List<Statemment> body;
    private List<VarDef> localVars;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Statemment> getBody() {
        return body;
    }

    public void setBody(List<Statemment> body) {
        this.body = body;
    }

    public List<VarDef> getLocalVars() {
        return localVars;
    }

    public void setLocalVars(List<VarDef> localVars) {
        this.localVars = localVars;
    }

    public FunDef(List<VarDef> parameters, List<Statemment> body, String id, Type type,
                  int line, int column) {
        super(line, column);
        this.body=body;
        this.localVars=parameters;
        this.id=id;
        this.type=type;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }
}
