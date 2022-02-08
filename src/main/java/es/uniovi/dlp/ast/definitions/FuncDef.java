package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statemment;
import es.uniovi.dlp.ast.types.FuncType;

import java.util.List;

public class FuncDef {

    private List<Statemment> body;
    private List<VarDef> varDefs;
    private String name;
    private FuncType type;
}
