package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.FunMain;
import es.uniovi.dlp.ast.definitions.VarDef;

import java.util.List;

public class Program implements ASTNode {
    private List<FunDef> funDefs;
    private List<VarDef> vardefs;
    private int line;
    private int column;

    public Program( List<VarDef> vardefs,List<FunDef> funDefs, int line, int column) {
        this.funDefs = funDefs;
        this.vardefs = vardefs;
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
