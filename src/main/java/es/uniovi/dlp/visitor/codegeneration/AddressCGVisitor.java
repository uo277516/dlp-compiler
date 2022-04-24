package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
import es.uniovi.dlp.ast.expressions.FileAccess;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.StructType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, Type> {

    private ValueCGVisitor valueCGVisitor;
    private CodeGenerator codeGenerator;

    public AddressCGVisitor(ValueCGVisitor valueCGVisitor, CodeGenerator codeGenerator) {
        this.valueCGVisitor = valueCGVisitor;
        this.codeGenerator = codeGenerator;
    }


    /**
     *address[[ ArrayAccess : expression -> position array ]]() =
     * 	address[[array]]
     *	value[[position]]
     * 	<push> obj.getType().numberOfBytes()
     * 	<mul>
     * 	<add>
     */
    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {
        arrayAccess.getArray().accept(this, param);
        arrayAccess.getIndex().accept(valueCGVisitor, param);
        codeGenerator.push(new IntType(arrayAccess.getLine(), arrayAccess.getColumn()), arrayAccess.getType().getNumberOfBytes());
        codeGenerator.mul(new IntType(arrayAccess.getLine(), arrayAccess.getColumn()));
        codeGenerator.add(new IntType(arrayAccess.getLine(), arrayAccess.getColumn()));

        return null;
    }


    /**
     *address[[ FieldAccess : expression -> expression field ]]() =
     * 	address[[expression]]
     * 	<push>field.offset
     * 	<add>
     */
    @Override
    public Type visit(FileAccess fileAccess, Type param) {
        fileAccess.getField().accept(this,param);
        StructType struct = (StructType) fileAccess.getField().getType();
        for(var fd : struct.getDefs())
            if(fd.getId().equals(fileAccess.getExpression()))
                codeGenerator.push(new IntType(fileAccess.getLine(), fileAccess.getColumn()), fd.getOffset());
        codeGenerator.add(new IntType(fileAccess.getLine(), fileAccess.getColumn()));
        return null;
    }


    /**
     *address[[ Variable : expression -> ID ]]() =
     * 	if(expression.def.scope == 0)
     * 		<pusha> expression.def.offset
     * 	else
     * 		<push bp>
     * 		<push> expression.def.offset
     * 		<add>
     */
    @Override
    public Type visit(Variable variable, Type param) {
        VarDef vardef = (VarDef) variable.getDefinition();
        System.out.println(vardef.getId() + "- " + vardef.getLine());
        if (vardef.getScope()==0) {
            codeGenerator.pusha(vardef.getOffset());
        } else {
            codeGenerator.pushaBP();
            codeGenerator.push(new IntType(variable.getLine(), variable.getColumn()), vardef.getOffset());
            codeGenerator.add(new IntType(variable.getLine(), variable.getColumn()));
        }

        return null;
    }
}
