package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.codegeneration.AddressCGVisitor;

public interface Expression extends ASTNode {

    boolean getLValue();
    void setLValue(boolean value);
    Type getType();
    void setType(Type type);


}
