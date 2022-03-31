package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.expressions.Arithmetic;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.Assigment;
import es.uniovi.dlp.ast.statements.Read;
import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.ErrorType;
import es.uniovi.dlp.ast.types.IntType;
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


    //-----------

    //comprobacion no sumar lo q no se pueda
    @Override
    public Type visit(Arithmetic a, Type param) {
        a.setLValue(false);
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);

        a.setType(a.getLeft().getType().arithmetic(a.getRight().getType()));

        if (a.getType() == null) {
            a.setType(new ErrorType(a.getLine(), a.getColumn()));
            Error e = new Error(a.getLine(), a.getColumn(), ErrorReason.INVALID_ARITHMETIC);
            ErrorManager.getInstance().addError(e);
        }


        return null;

    }


    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        unaryMinus.getExpression().accept(this, param);
        unaryMinus.setLvalue(false);

        if (!unaryMinus.getType().isArithmetic()) {
            unaryMinus.setType(new ErrorType(unaryMinus.getLine(), unaryMinus.getColumn()));
            Error e = new Error(unaryMinus.getLine(), unaryMinus.getColumn(), ErrorReason.INVALID_ARITHMETIC);
            ErrorManager.getInstance().addError(e);
        }

        return null;
    }




    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        charLiteral.setLvalue(false);
        charLiteral.setType(new CharType(charLiteral.getLine(), charLiteral.getColumn()));

        return null;
    }


    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        intLiteral.setLvalue(false);
        intLiteral.setType(new IntType(intLiteral.getLine(), intLiteral.getColumn()));

        return null;
    }


    @Override
    public Type visit(RealLiteral realLiteral, Type param) {
        realLiteral.setLvalue(false);
        realLiteral.setType(new IntType(realLiteral.getLine(), realLiteral.getColumn()));

        return null;
    }


}
