package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;

public interface Type extends ASTNode {

    //arithmetic,logicl,indexing,dot/String field),cast(type from),comparison(leftType)

    Type arithmetic(Type type);
    Type logical(Type type);
    Type indexing(Type type);
    Type dot(String field);
    Type cast(Type from);
    Type comparison(Type leftType);


    //bool- promotcableTo(type to), islogical, isindexable, isarethmetic, allowdot

    boolean promotableTo(Type to); //llamo derecha y paso izquierda
    boolean isLogical();
    boolean isIndexable();
    boolean isArithmetic();
    boolean allowDot();

    //comparison.settyoe leftype.vompstidon(righttype) esto en el typecheckingviitor

    //Para el OffsetVisitor
    int getNumberOfBytes();
}
