package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.FunMain;
import es.uniovi.dlp.ast.definitions.VarDef;

import java.util.List;

public class Program implements ASTNode {
    private List<FunDef> funDefs;
    private List<VarDef> vardefs;
    private FunMain main;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
