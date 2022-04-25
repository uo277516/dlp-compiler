package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;


public interface Visitor<ReturnType, ParamType> {
    ReturnType visit(Program program, ParamType param);

    ReturnType visit(FunDef funDef, ParamType param);
    ReturnType visit(RecordField recordField, ParamType param);
    ReturnType visit(VarDef varDef, ParamType param);

    ReturnType visit(Arithmetic arithmetic, ParamType param);
    ReturnType visit(ArithmeticMultiply arithmeticMultiply, ParamType param);
    ReturnType visit(ArrayAccess arrayAccess, ParamType param);
    ReturnType visit(Cast cast, ParamType param);
    ReturnType visit(CharLiteral charLiteral, ParamType param);
    ReturnType visit(Comparator comparator, ParamType param);
    ReturnType visit(FieldAccess fileAccess, ParamType param);
    ReturnType visit(IntLiteral intLiteral, ParamType param);
    ReturnType visit(Invocation invocation, ParamType param);
    ReturnType visit(Logical logical, ParamType param);
    ReturnType visit(RealLiteral realLiteral, ParamType param);
    ReturnType visit(UnaryMinus unaryMinus, ParamType param);
    ReturnType visit(UnaryNot unaryNot, ParamType param);
    ReturnType visit(Variable variable, ParamType param);

    ReturnType visit(Assigment assigment, ParamType param);
    ReturnType visit(IfElse ifElse, ParamType param);
    ReturnType visit(Read read, ParamType param);
    ReturnType visit(Return re, ParamType param);
    ReturnType visit(While wh, ParamType param);
    ReturnType visit(Write write, ParamType param);

    ReturnType visit(ArrayType arrayType, ParamType param);
    ReturnType visit(CharType charType, ParamType param);
    ReturnType visit(FunType funType, ParamType param);
    ReturnType visit(IntType intType, ParamType param);
    ReturnType visit(RealType realType, ParamType param);
    ReturnType visit(VoidType voidType, ParamType param);
    ReturnType visit(StructType structType, ParamType param);
    ReturnType visit(ErrorType errorType, ParamType param);
}
