package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.expressions.Arithmetic;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.Assigment;
import es.uniovi.dlp.ast.statements.Read;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {
    //astrat exp y solo constuctor en las q tienen true

    //aqui identificar en las statements dnde necesito value y si no error
    //override d las exprsiones q nece4sitan lvlaue
    //creo que son tods menos ls literalees
    //value es que se le puede asignqar un valor!!!!

    //que cuando necesite un lvalue lo tenga
    //lo necesitan asignacion y read

    @Override
    public Type visit(Assigment assigment, Type param) {
        //recorro hijos y tengo q mirar q la parte de la isquierda tengan lvalue
        //y si no tienen el error
        super.visit(assigment, param);
        if (!assigment.getLeft().getLValue()) {
            Error e = new Error(assigment.getLine(), assigment.getColumn(), ErrorReason.LVALUE_REQUIRED);
            ErrorManager.getInstance().addError(e);
        }
        return null;
    }


    @Override
    public Type visit(Read read, Type param) {
        super.visit(read, param);
        if (!read.getExpression().getLValue()) {
            Error e = new Error(read.getLine(), read.getColumn(), ErrorReason.LVALUE_REQUIRED);
            ErrorManager.getInstance().addError(e);
        }
        return null;
    }



    //comprobacion no sumar lo q no se pueda
    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        super.visit(arithmetic, param);

        Expression leftExpression = arithmetic.getLeft();
        Expression rightExpression = arithmetic.getRight();

        Type arithmeticType = leftExpression.getType().arithmetic(rightExpression.getType());

        if (arithmeticType == null) {
            Error e = new Error(arithmetic.getLine(), arithmetic.getColumn(), ErrorReason.INVALID_ARITHMETIC);
            ErrorManager.getInstance().addError(e);
        }

        return null;

    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        super.visit(unaryMinus, param);

        //si el tipo del unary minus es distinto isArithmetic
        if (!unaryMinus.getType().isArithmetic()) {
            Error e = new Error(unaryMinus.getLine(), unaryMinus.getColumn(), ErrorReason.INVALID_ARITHMETIC);
            ErrorManager.getInstance().addError(e);
        }

        return null;
    }
}
