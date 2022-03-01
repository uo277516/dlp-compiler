package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FuncDef;
import es.uniovi.dlp.ast.definitions.FuncMain;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.expressions.arithmetics.Arithmetic;

import java.util.List;

public class Program implements ASTNode {
    private List<FuncDef> funDefs;
    private List<VarDef> vardefs;
    private FuncMain main;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
