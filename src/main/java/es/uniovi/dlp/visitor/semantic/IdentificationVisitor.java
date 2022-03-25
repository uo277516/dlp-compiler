package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunDef;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.FunType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Type, Type>  {

    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public Type visit (FunDef funDef, Type param) {
        symbolTable.set();  //pongo el scope a 1-> estoy en una funcion

        System.out.println(symbolTable.insert(funDef));

        funDef.getType().accept(this, param);

        //ámbito de cada parámetro
        for (var parameter: ((FunType) funDef.getType()).getParams()) {
            parameter.setScope(1);
            symbolTable.insert(parameter);
        }

        //pongo el ambito de cada definicion de la funcion y la añado
        for (var definition: funDef.getLocalVars()) {
            definition.setScope(1);
            symbolTable.insert(definition);
        }

        //acepto los statements
        funDef.getBody().forEach(statement -> statement.accept(this, param));

        //despues de añadir todoo, cambio el ambito a 0 otra vez
        symbolTable.reset();
        return null;
    }


    @Override
    public Type visit(VarDef varDef, Type param) {
        varDef.getType().accept(this,param);
        varDef.setScope(0);
        if (symbolTable.findInCurrentScope(varDef.getId())==null) {
            symbolTable.insert(varDef);
        } else {
            Error e = new Error(varDef.getLine(), varDef.getColumn(), ErrorReason.VARIABLE_ALREADY_DECLARED);
            ErrorManager.getInstance().addError(e);
        }

        return null;
    }


    @Override
    public Type visit(Variable variable, Type param) {
        if (symbolTable.find(variable.getVar())==null) {
            Error e = new Error(variable.getLine(), variable.getColumn(), ErrorReason.VARIABLE_NOT_DECLARED);
            ErrorManager.getInstance().addError(e);
        }

        return null;
    }


    @Override
    public Type visit(Invocation invocation, Type param) {
        invocation.getParams().forEach(parameter -> parameter.accept(this, param));
        if (symbolTable.find(invocation.getVariable().getVar())==null) {
            Error e = new Error(invocation.getLine(), invocation.getColumn(), ErrorReason.FUNCTION_NOT_DECLARED);
            ErrorManager.getInstance().addError(e);
        }

        return null;
    }



}
