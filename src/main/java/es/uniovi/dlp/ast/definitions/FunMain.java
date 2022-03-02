package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statemment;
import es.uniovi.dlp.ast.types.Type;

import java.util.ArrayList;
import java.util.List;

public class FunMain extends FunDef {


    public FunMain(List<VarDef> parameters, List<Statemment> body, String id, Type type, int line, int column) {
        super(parameters, body, id, type, line, column);
    }
}
