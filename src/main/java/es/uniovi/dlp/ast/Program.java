package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.expressions.arithmetics.Arithmetic;

import java.util.List;

public class Program implements ASTNode {
    private List<Definition> definitions;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
