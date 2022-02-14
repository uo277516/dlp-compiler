package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.Type;

public class VarDef implements Definition {

    private Variable variable;
    private Type type;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
