package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.expressions.*;
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


    @Override
    public Type visit(ArithmeticMultiply arithmeticMultiply, Type param) {
        return super.visit(arithmeticMultiply, param);
    }

    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {
        return super.visit(arrayAccess, param);
    }

    @Override
    public Type visit(Cast cast, Type param) {
        return super.visit(cast, param);
    }

    @Override
    public Type visit(Comparator comparator, Type param) {
        return super.visit(comparator, param);
    }

    @Override
    public Type visit(FileAccess fileAccess, Type param) {
        return super.visit(fileAccess, param);
    }

    @Override
    public Type visit(Invocation invocation, Type param) {
        return super.visit(invocation, param);
    }

    @Override
    public Type visit(Logical logical, Type param) {
        return super.visit(logical, param);
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        return super.visit(unaryMinus, param);
    }

    @Override
    public Type visit(UnaryNot unaryNot, Type param) {
        return super.visit(unaryNot, param);
    }

    @Override
    public Type visit(Variable variable, Type param) {
        return super.visit(variable, param);
    }


}
