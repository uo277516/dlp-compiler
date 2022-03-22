package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;

public interface Expression extends ASTNode {

    boolean getLValue();
    void setLValue(boolean value);
}
