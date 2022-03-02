package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statemment;
import es.uniovi.dlp.ast.types.FunType;
import es.uniovi.dlp.ast.types.Type;

import java.util.List;


public class FunDef implements Definition {

    private String id;
    private Type type;
    private List<Statemment> body;
    private List<VarDef> parameters;
    private int line;
    private int column;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public FunDef(  List<VarDef> parameters, List<Statemment> body, String id, Type type,
                   int line,  int column) {
        this.body=body;
        this.parameters=parameters;
        this.id=id;
        this.type=type;
        this.line=line;
        this.column=column;
    }

}
