package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.RecordField;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.expressions.Arithmetic;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

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
    public Type visit(IntLiteral i, Type param) {
        i.setLvalue(false);
        i.setType(new IntType(i.getLine(), i.getColumn()));
        return null;
    }

    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        charLiteral.setLvalue(false);
        charLiteral.setType(new CharType(charLiteral.getLine(), charLiteral.getColumn()));
        return null;
    }



    @Override
    public Type visit(RealLiteral realLiteral, Type param) {
        realLiteral.setLvalue(false);
        realLiteral.setType(new RealType(realLiteral.getLine(), realLiteral.getColumn()));
        return null;
    }


    @Override
    public Type visit(ArithmeticMultiply a, Type param) {
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

        if (!unaryMinus.getExpression().getType().isArithmetic()) {
            unaryMinus.setType(new ErrorType(unaryMinus.getLine(), unaryMinus.getColumn()));
            Error e = new Error(unaryMinus.getLine(), unaryMinus.getColumn(), ErrorReason.INVALID_ARITHMETIC);
            ErrorManager.getInstance().addError(e);
        }
        return null;
    }


    @Override
    public Type visit(Variable variable, Type param) {
        variable.setLvalue(true);
        variable.setType(variable.getDefinition().getType());
        return null;
    }


    @Override
    public Type visit(Return r, Type param) {
        r.getExpression().accept(this, param);

        if (!r.getExpression().getType().promotableTo(param)) {
            r.getExpression().setType(new ErrorType(r.getLine(), r.getColumn()));
            Error e = new Error(r.getLine(), r.getColumn(), ErrorReason.INVALID_RETURN_TYPE);
            ErrorManager.getInstance().addError(e);
        }
        return null;


    }


    @Override
    public Type visit(Program program, Type param) {
        return super.visit(program, param);
    }

    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {
        arrayAccess.getArray().accept(this, param); //left
        arrayAccess.getIndex().accept(this, param); //right
        arrayAccess.setLValue(true);


        arrayAccess.setType(arrayAccess.getIndex().getType().indexing(arrayAccess.getArray().getType()));


        if (!arrayAccess.getIndex().getType().isIndexable()) {
            arrayAccess.setType(new ErrorType(arrayAccess.getLine(), arrayAccess.getColumn()));
            Error e = new Error(arrayAccess.getLine(), arrayAccess.getColumn(), ErrorReason.INVALID_INDEXING);
            ErrorManager.getInstance().addError(e);
        }
        else if (arrayAccess.getType() == null) {
            arrayAccess.setType(new ErrorType(arrayAccess.getLine(), arrayAccess.getColumn()));
            Error e = new Error(arrayAccess.getLine(), arrayAccess.getColumn(), ErrorReason.INVALID_INDEX_EXPRESSION);
            ErrorManager.getInstance().addError(e);
        }

        return null;
    }

    @Override
    public Type visit(Cast c, Type param) {
        c.getExpression().accept(this, param);
        c.getTypeToCast().accept(this, param);
        c.setLValue(false);

        c.setType(c.getExpression().getType().cast(c.getTypeToCast()));
        if (c.getType() == null) {
            c.setType(new ErrorType(c.getLine(), c.getColumn()));
            Error e = new Error(c.getLine(), c.getColumn(), ErrorReason.INVALID_CAST);
            ErrorManager.getInstance().addError(e);
        }
        return null;
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
    public Type visit(UnaryNot unaryNot, Type param) {
        return super.visit(unaryNot, param);
    }



    @Override
    public Type visit(IfElse ifElse, Type param) {
        return super.visit(ifElse, param);
    }

    @Override
    public Type visit(While wh, Type param) {
        return super.visit(wh, param);
    }

    @Override
    public Type visit(Write write, Type param) {
        return super.visit(write, param);
    }

    @Override
    public Type visit(ArrayType arrayType, Type param) {
        return super.visit(arrayType, param);
    }

    @Override
    public Type visit(CharType charType, Type param) {
        return super.visit(charType, param);
    }

    @Override
    public Type visit(FunType funType, Type param) {
        return super.visit(funType, param);
    }

    @Override
    public Type visit(IntType intType, Type param) {
        return super.visit(intType, param);
    }

    @Override
    public Type visit(RealType realType, Type param) {
        return super.visit(realType, param);
    }

    @Override
    public Type visit(VoidType voidType, Type param) {
        return super.visit(voidType, param);
    }

    @Override
    public Type visit(StructType structType, Type param) {
        return super.visit(structType, param);
    }

    @Override
    public Type visit(ErrorType errorType, Type param) {
        return super.visit(errorType, param);
    }


    @Override
    public Type visit(FunDef fundef, Type param) {
        return super.visit(fundef, param);
    }

    @Override
    public Type visit(RecordField recordField, Type param) {
        return super.visit(recordField, param);
    }

    @Override
    public Type visit(VarDef varDef, Type param) {
        return super.visit(varDef, param);
    }


}
