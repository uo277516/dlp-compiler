package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.RecordField;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
import es.uniovi.dlp.ast.expressions.FieldAccess;
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
     *address[[ ArrayAccess : expression -> index array ]]() =
     * 	address[[array]]
     *	value[[index]]
     * 	<push> IntType, obj.getType().numberOfBytes()
     * 	<mul> IntType
     * 	<add> IntType
     */
    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {
        arrayAccess.getIndex().accept(this, param);
        arrayAccess.getArray().accept(valueCGVisitor, param); //los tengo cambiados, array es el index y index es el array
        codeGenerator.push(new IntType(arrayAccess.getLine(), arrayAccess.getColumn()), arrayAccess.getType().getNumberOfBytes());
        codeGenerator.mul(new IntType(arrayAccess.getLine(), arrayAccess.getColumn()));
        codeGenerator.add(new IntType(arrayAccess.getLine(), arrayAccess.getColumn()));

        return null;
    }


    /**
     *address[[ FieldAccess : expression -> expression field ]]() =
     * 	address[[expression]]
     * 	<push> IntType, field.offset
     * 	<add> IntType
     */
    @Override
    public Type visit(FieldAccess fileAccess, Type param) {
        //acepto la expresion
        //si el tipo de ña expression es recortipe con getfield con un array de recordfields
        //offset del getfield ().offset
        //        push deñ pffswet

        fileAccess.getField().accept(this,param);
        StructType struct = (StructType) fileAccess.getField().getType();
        RecordField rf = struct.getRecordField(fileAccess.getExpression());
        codeGenerator.push(new IntType(rf.getLine(), rf.getColumn()), rf.getOffset());
        codeGenerator.add(new IntType(rf.getLine(), rf.getColumn()));

        return null;
    }


    /**
     *address[[ Variable : expression -> string ]]() =
     * 	if(expression.def.scope == 0)
     * 		<pusha> expression.def.offset
     * 	else
     * 		<pusha bp>
     * 		<push> IntType, expression.def.offset
     * 		<add> IntType
     */
    @Override
    public Type visit(Variable variable, Type param) {
        //-pair
        VarDef vardef = (VarDef) variable.getDefinition();

        if (vardef.getScope()==0) { //en struct global entra x aqui
            codeGenerator.pusha(vardef.getOffset());
        } else {
            codeGenerator.pushaBP();
            codeGenerator.push(new IntType(variable.getLine(), variable.getColumn()), vardef.getOffset());
            codeGenerator.add(new IntType(variable.getLine(), variable.getColumn()));
        }

        return null;
    }
}
