package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.Type;

public interface Expression extends ASTNode {

    boolean getLValue();
    void setLValue(boolean value);
    Type getType();
}
