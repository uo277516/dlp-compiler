package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, Type> {
    private CodeGenerator codeGenerator;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
        this.addressCGVisitor = new AddressCGVisitor(this, codeGenerator);
    }

    //Override de todas las expresiones

    /**
     *value [[ Arithmetic : expression -> expression expression ]]() =
     * 	value[[expression1]]
     * 	value[[expression2]]
     * 	if(obj.getOperator.equals("+"))
     * 		<add>arithmetic.getType().suffix()
     * 	if(obj.getOperator.equals("-"))
     * 		<sub>arithmetic.getType().suffix()
     * 	if(obj.getOperator.equals("*"))
     * 		<mul>arithmetic.getType().suffix()
     * 	if(obj.getOperator.equals("/"))
     * 		<div>arithmetic.getType().suffix()
     *
     */
    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        arithmetic.getLeft().accept(this, param);
        if (arithmetic.getLeft().getType() instanceof CharType) {
            codeGenerator.convert(arithmetic.getLeft().getType(), new IntType(arithmetic.getLine(), arithmetic.getColumn()));
        }
        arithmetic.getRight().accept(this, param);
        if (arithmetic.getRight().getType() instanceof CharType) {
            codeGenerator.convert(arithmetic.getRight().getType(), new IntType(arithmetic.getLine(), arithmetic.getColumn()));
        }
        codeGenerator.arithmetic(arithmetic.getOperator(), arithmetic.getType());

        return null;
    }
    @Override
    public Type visit(ArithmeticMultiply arithmetic, Type param) {
        arithmetic.getLeft().accept(this, param);
        if (arithmetic.getLeft().getType() instanceof CharType) {
            codeGenerator.convert(arithmetic.getLeft().getType(), new IntType(arithmetic.getLine(), arithmetic.getColumn()));
        }
        arithmetic.getRight().accept(this, param);
        if (arithmetic.getRight().getType() instanceof CharType) {
            codeGenerator.convert(arithmetic.getRight().getType(), new IntType(arithmetic.getLine(), arithmetic.getColumn()));
        }
        codeGenerator.arithmetic(arithmetic.getOperator(), arithmetic.getType());

        return null;
    }


    /**
     *value [[ ArrayAccess : expression -> position array ]]() =
     * 	address[[ArrayAccess]]
     *	<load>arrayAccess.getType().suffix();
     *
     */
    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {
        arrayAccess.getArray().accept(addressCGVisitor, param);
        codeGenerator.load(arrayAccess.getType());

        return null;
    }

    /**
     *value [[ Cast : expression -> castType expression ]]() =
     * 	value[[expression]]
     * 	cast.getType().suffix()<2i>
     * 	if(castType instanceof Integer == false)
     * 		<i2>castType.suffix()
     *
     */
    @Override
    public Type visit(Cast cast, Type param) {
        cast.getExpression().accept(this, param);
        codeGenerator.convert(cast.getExpression().getType(), cast.getTypeToCast());

        return null;
    }


    /**
     *value [[ CharLiteral : expression -> ]]() =
     * 	<push>charLiteral.getType().suffix() charLiteral.getValue()
     *
     */
    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        codeGenerator.push(charLiteral.getType(), charLiteral.getValue());
        return null;
    }

    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        codeGenerator.push(intLiteral.getType(), intLiteral.getValue());

        return null;
    }

    @Override
    public Type visit(RealLiteral realLiteral, Type param) {
        codeGenerator.push(realLiteral.getType(), realLiteral.getValue());

        return null;
    }


    /**
     *value [[ Comparison : expression -> expression expression ]]() =
     * 	value[[expression1]]
     * 	value[[expression2]]
     * 	if(comparison.getOperator().equals(">"))
     * 		<gt>arithmetic.getType().suffix()
     * 	if(comparison.getOperator().equals(">="))
     * 		<ge>arithmetic.getType().suffix()
     * 	if(comparison.getOperator().equals("<"))
     * 		<lt>arithmetic.getType().suffix()
     * 	if(comparison.getOperator().equals("<="))
     * 		<le>arithmetic.getType().suffix()
     * 	if(comparison.getOperator().equals("=="))
     * 		<eq>arithmetic.getType().suffix()
     * 	if(comparison.getOperator().equals("!="))
     * 		<ne>arithmetic.getType().suffix()
     *
     */
    @Override
    public Type visit(Comparator comparator, Type param) {
        comparator.getLeft().accept(this, param);
        comparator.getRight().accept(this, param);
        codeGenerator.comparison(comparator.getOperator(), comparator.getType());

        return null;
    }


    /**
     *value [[ FieldAccess : expression -> expression ]]() =
     * 	address[[FieldAccess]]
     * 	<load>fieldAccess.getType().suffix()
     *
     */
    @Override
    public Type visit(FieldAccess fileAccess, Type param) {
        fileAccess.getField().accept(addressCGVisitor, param);
        codeGenerator.load(fileAccess.getType());

        return null;
    }


    /**
     *value[[Invocation : expression1 -> expression2 expression*]]() =
     * 	for(Expression arg : expression)
     * 		value[[arg]]()
     * 	<call> expression2.name
     *
     */
    @Override
    public Type visit(Invocation invocation, Type param) {
        //mirar si es statement o expresion
        for (var e: invocation.getParams()) {
            e.accept(this, param);
        }
        codeGenerator.call(invocation.getVariable().getVar());

        return null;
    }


    /**
     *value [[ Logical : expression -> expression expression ]]() =
     * 	value[[expression1]]
     * 	value[[expression2]]
     * 	if(logical.getOperator().equals("&&"))
     * 		<and>
     * 	if(logical.getOperator().equals("||"))
     * 		<or>
     *
     */
    @Override
    public Type visit(Logical logical, Type param) {
        logical.getLeft().accept(this, param);
        logical.getRight().accept(this, param);
        codeGenerator.logic(logical.getOperator());

        return null;
    }


    /**
     *value [[ UnaryMinus : expression -> expression ]]() =
     * 	if(expression.getType().suffix().equals("i"))
     * 		<push>Integer.getInstance().suffix() 0
     * 	else
     * 		<push>Real.getInstance().suffix() 0
     *	value[[expression]]
     * 	<sub>expression.getType().suffix()
     *
     */
    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        codeGenerator.push(unaryMinus.getExpression().getType(), 0);
        unaryMinus.getExpression().accept(this, param);
        codeGenerator.sub(unaryMinus.getExpression().getType());

        return null;
    }


    /**
     *value [[ UnaryNot : expression -> expression ]]() =
     * 	value[[expression]]
     * 	<not>
     *
     */
    @Override
    public Type visit(UnaryNot unaryNot, Type param) {
        unaryNot.getExpression().accept(this, param);
        codeGenerator.not();

        return null;
    }


    /**
     *value[[ Variable : expression -> ID ]]() =
     * 	address[[expression]]()
     * 	<load>expression.type.suffix()
     *
     */
    @Override
    public Type visit(Variable variable, Type param) {
        variable.accept(addressCGVisitor, param);
        codeGenerator.load(variable.getType());

        return null;
    }

    //indexing(arrayaccess) y fieldacess
}
