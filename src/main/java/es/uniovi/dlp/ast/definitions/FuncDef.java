package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statemment;
import es.uniovi.dlp.ast.types.FuncType;

import java.util.List;


public class FuncDef implements Definition {

    private List<Statemment> body;
    private List<VarDef> varDefs;
    private String name;
    private FuncType type;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
