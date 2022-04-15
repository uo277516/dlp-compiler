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

        System.out.println(assigment.getLine()+"---------"+assigment.getLeft().getType());
        System.out.println(assigment.getLine()+"---------"+assigment.getRight().getType());


        System.out.println("````" + assigment.getRight().getType().promotableTo(assigment.getLeft().getType()));
        if (!assigment.getRight().getType().promotableTo(assigment.getLeft().getType())) {
            assigment.getLeft().setType(new ErrorType(assigment.getLine(), assigment.getColumn()));
            Error e = new Error(assigment.getLine(), assigment.getColumn(), ErrorReason.INCOMPATIBLE_TYPES);
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


        unaryMinus.setType(unaryMinus.getExpression().getType());

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
        System.out.println("tipo de la variable"+variable.getDefinition().getType());
        variable.setType(variable.getDefinition().getType());
        return null;
    }


    @Override
    public Type visit(FunType f, Type param) {
        f.getReturnType().accept(this, param);
        for (var v : f.getParams())
            v.accept(this, param);

        return f.getReturnType();
    }



    @Override
    public Type visit(Return r, Type param) {
        r.getExpression().accept(this, param);
        r.getExpression().getType().accept(this,param);



        Type tipoFuncionRet = ((FunType) param).getReturnType();


        if (!r.getExpression().getType().getClass().equals(tipoFuncionRet.getClass())) {
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


        System.out.println(arrayAccess.getIndex().getType());
        System.out.println(arrayAccess.getArray().getType());
        arrayAccess.setType(arrayAccess.getIndex().getType().indexing(arrayAccess.getArray().getType()));

        System.out.println(arrayAccess.getLine()+"tipo del array access "+arrayAccess.getType());

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
    public Type visit(Logical l, Type param) {
        l.getLeft().accept(this, param);
        l.getRight().accept(this, param);
        l.setLValue(false);
        l.setType(l.getLeft().getType().logical(l.getRight().getType()));
        if (l.getType() == null) {
            l.setType(new ErrorType(l.getLine(), l.getColumn()));
            Error e = new Error(l.getLine(), l.getColumn(), ErrorReason.INVALID_LOGICAL);
            ErrorManager.getInstance().addError(e);
        }
        return null;
    }



    @Override
    public Type visit(Comparator c, Type param) {
        c.getRight().accept(this, param);
        c.getLeft().accept(this, param);
        c.setLValue(false);


        c.setType(c.getLeft().getType().comparison(c.getRight().getType()));

        if (c.getType() == null) {
            c.setType(new ErrorType(c.getLine(), c.getColumn()));
            Error e = new Error(c.getLine(), c.getColumn(), ErrorReason.INVALID_COMPARISON);
            ErrorManager.getInstance().addError(e);
        }
        return null;
    }

    @Override
    public Type visit(FileAccess f, Type param) {
        f.getField().accept(this, param);
        f.setLValue(true);

        f.setType(f.getField().getType().dot(f.getExpression()));

        if (!f.getField().getType().allowDot())
        {
            f.setType(new ErrorType(f.getLine(), f.getColumn()));
            Error e = new Error(f.getLine(), f.getColumn(), ErrorReason.INVALID_DOT);
            ErrorManager.getInstance().addError(e);
        }

        if (f.getType() == null) {
            f.setType(new ErrorType(f.getLine(), f.getColumn()));
            Error e = new Error(f.getLine(), f.getColumn(), ErrorReason.NO_SUCH_FIELD);
            ErrorManager.getInstance().addError(e);
        }
        return null;
    }

    @Override
    public Type visit(Invocation i, Type param) {
        i.getVariable().accept(this, param);
        List<Type> types = new ArrayList<>();  //arraylist con los tipos de los parametros de la invocacion

        for (Expression e : i.getParams()) {
            e.accept(this, param);
            types.add(e.getType());
        }

        i.setType(i.getVariable().getType());

        if (!(i.getType() instanceof FunType)) {
            i.setType(new ErrorType(i.getLine(), i.getColumn()));
            Error e = new Error(i.getLine(), i.getColumn(), ErrorReason.INVALID_INVOCATION);
            ErrorManager.getInstance().addError(e);
        } else {
            List<VarDef> params = ((FunType) i.getType()).getParams(); //parametros de la funcion

            if (params.size()!=types.size()) {
                i.setType(new ErrorType(i.getLine(), i.getColumn()));
                Error e = new Error(i.getLine(), i.getColumn(), ErrorReason.INVALID_ARGS);
                ErrorManager.getInstance().addError(e);
            }  else {
                for (int j=0; j<types.size(); j++) {
                    if (!types.get(j).promotableTo(params.get(j).getType())) {
                        i.setType(new ErrorType(i.getLine(), i.getColumn()));
                        Error e = new Error(i.getLine(), i.getColumn(), ErrorReason.INVALID_ARGS);
                        ErrorManager.getInstance().addError(e);
                    }
                }
            }
        }


        return null;
    }




    @Override
    public Type visit(UnaryNot u, Type param) {
        u.getExpression().accept(this, param);
        u.setLValue(false);

        if (!u.getExpression().getType().isLogical()) {
            u.setType(new ErrorType(u.getLine(), u.getColumn()));
            Error e = new Error(u.getLine(), u.getColumn(), ErrorReason.NOT_LOGICAL);
            ErrorManager.getInstance().addError(e);
        }
        else
            u.setType(new IntType(u.getLine(), u.getColumn()));
        return null;
    }



    @Override
    public Type visit(IfElse i, Type param) {
        i.getCondicion().accept(this, param);
        if (!i.getCondicion().getType().isLogical()) {
            i.getCondicion().setType(new ErrorType(i.getLine(), i.getColumn()));
            Error e = new Error(i.getCondicion().getLine(), i.getCondicion().getColumn(), ErrorReason.NOT_LOGICAL);
            ErrorManager.getInstance().addError(e);
        }

        for (Statemment s : i.getIfSts()) {
            s.accept(this, param);
        }

        for (Statemment s : i.getElseSts()) {
            s.accept(this, param);
        }

        return null;
    }

    @Override
    public Type visit(While w, Type param) {
        w.getCondicion().accept(this, param);

        if (!w.getCondicion().getType().isLogical()) {
            w.getCondicion().setType(new ErrorType(w.getLine(), w.getColumn()));
            Error e = new Error(w.getCondicion().getLine(), w.getCondicion().getColumn(), ErrorReason.NOT_LOGICAL);
            ErrorManager.getInstance().addError(e);
        }

        for (Statemment s : w.getSts()) {
            s.accept(this, param);
        }

        return null;
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
    public Type visit(ErrorType errorType, Type param) {
        return super.visit(errorType, param);
    }


    @Override
    public Type visit(FunDef fundef, Type param) {
        fundef.getType().accept(this, param);
        fundef.getLocalVars().forEach(local -> local.accept(this, param));
        fundef.getBody().forEach(statement -> statement.accept(this, fundef.getType()));
        return null;
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
