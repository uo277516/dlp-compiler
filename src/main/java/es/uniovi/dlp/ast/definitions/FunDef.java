package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statemment;
import es.uniovi.dlp.ast.types.FunType;

import java.util.List;


public class FunDef implements Definition {

    private List<Statemment> body;
    private List<VarDef> parameters;
    private String name;
    private FunType type;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
