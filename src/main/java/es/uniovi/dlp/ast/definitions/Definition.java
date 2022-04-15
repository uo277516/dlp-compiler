package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.Type;

public interface Definition extends ASTNode {

    Type getType();
    void setType(Type type);
    int getScope();
    void setScope(int scope);
    String getId();

}
