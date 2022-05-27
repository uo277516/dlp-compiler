package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

public abstract class AbstractVisitor<ReturnType, ParamType> implements Visitor<ReturnType, ParamType> {

    //Program
    @Override
    public ReturnType visit(Program program, ParamType param) {
        program.getDefinitions().forEach(definition -> definition.accept(this, param));
        return null;
    }



    //Definitions

    @Override
    public ReturnType visit(FunDef fundef, ParamType param) {
        fundef.getType().accept(this, param);
        fundef.getLocalVars().forEach(local -> local.accept(this, param));
        fundef.getBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(RecordField recordField, ParamType param) {
        recordField.getType().accept(this,param);
        return null;
    }

    @Override
    public ReturnType visit(VarDef varDef, ParamType param) {
        varDef.getType().accept(this,param);
        return null;
    }



    //Expressions

    @Override
    public ReturnType visit(Arithmetic arithmetic, ParamType param) {
        arithmetic.getLeft().accept(this,param);
        arithmetic.getRight().accept(this,param);
        return null;
    }

    @Override
    public ReturnType visit(ArithmeticMultiply arithmeticMultiply, ParamType param) {
        arithmeticMultiply.getLeft().accept(this,param);
        arithmeticMultiply.getRight().accept(this,param);
        return null;
    }

    @Override
    public ReturnType visit(ArrayAccess arrayAccess, ParamType param) {
        arrayAccess.getArray().accept(this,param);
        arrayAccess.getIndex().accept(this,param);
        return null;
    }

    @Override
    public ReturnType visit(Cast cast, ParamType param) {
        cast.getTypeToCast().accept(this,param);
        cast.getExpression().accept(this,param);
        return null;
    }


    @Override
    public ReturnType visit(CharLiteral charLiteral, ParamType param) {
        return null;
    }
    @Override
    public ReturnType visit(IntLiteral intLiteral, ParamType param) {
        return null;
    }
    @Override
    public ReturnType visit(RealLiteral realLiteral, ParamType param) {
        return null;
    }
    @Override
    public ReturnType visit(BooleanLiteral booleanLiteral, ParamType param) {
        return null;
    }



    @Override
    public ReturnType visit(Comparator comparator, ParamType param) {
        comparator.getLeft().accept(this,param);
        comparator.getRight().accept(this,param);
        return null;
    }

    @Override
    public ReturnType visit(FieldAccess fileAccess, ParamType param) {
        fileAccess.getField().accept(this,param);
        return null;
    }

    @Override
    public ReturnType visit(Invocation invocation, ParamType param) {
        invocation.getVariable().accept(this,param);
        invocation.getParams().forEach(expression -> expression.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(Logical logical, ParamType param) {
        logical.getLeft().accept(this, param);
        logical.getRight().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(UnaryMinus unaryMinus, ParamType param) {
        unaryMinus.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(UnaryNot unaryNot, ParamType param) {
        unaryNot.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Variable variable, ParamType param) {
        return null;
    }



    //Statements

    @Override
    public ReturnType visit(Assigment assigment, ParamType param) {
        assigment.getLeft().accept(this, param);
        assigment.getRight().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(IfElse ifElse, ParamType param) {
        ifElse.getElseSts().forEach(s -> s.accept(this, param));
        ifElse.getCondicion().accept(this,param);
        ifElse.getIfSts().forEach(s -> s.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(Read read, ParamType param) {
        read.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Return re, ParamType param) {
        re.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(While wh, ParamType param) {
        wh.getCondicion().accept(this,param);
        wh.getSts().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(Write write, ParamType param) {
        write.getExpression().accept(this,param);
        return null;
    }

    @Override
    public ReturnType visit(ArrayType arrayType, ParamType param) {
        arrayType.getType().accept(this,param);
        return null;
    }

    @Override
    public ReturnType visit(CharType charType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(FunType funType, ParamType param) {
        //funType.getReturnType().accept(this,param)
        return null;
    }

    @Override
    public ReturnType visit(IntType intType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(RealType realType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(VoidType voidType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(StructType structType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(ErrorType errorType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(BooleanType booleanType, ParamType param) {
        return null;
    }
}
