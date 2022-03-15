package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
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

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    public List<Definition> getDefinitions() {
        List<Definition> defs = new ArrayList<Definition>();
        defs.addAll(funDefs);
        defs.addAll(vardefs);
        return defs;
    }
}
