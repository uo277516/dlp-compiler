package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.expressions.Arithmetic;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {
    //astrat exp y solo constuctor en las q tienen true

    //aqui identificar en las statements dnde necesito value y si no error
    //override d las exprsiones q nece4sitan lvlaue
    //creo que son tods menos ls literalees
    //value es que se le puede asignqar un valor!!!

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        return super.visit(arithmetic, param);
    }
}
