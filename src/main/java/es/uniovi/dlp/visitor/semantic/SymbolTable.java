package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;

import java.util.*;

//cuando visito una variable, hay que asinarle su definicion
//

public class SymbolTable {
    private int scope = 0;
    private List<Map<String, Definition>> table;

    public SymbolTable() {
    }

    public void set() {
    }

    public void reset() {
    }

    public boolean insert(Definition definition) {
        return true;
    }

    public Definition find(String id) {
        return null;
    }

    public Definition findInCurrentScope(String id) {
        return null;
    }
}
