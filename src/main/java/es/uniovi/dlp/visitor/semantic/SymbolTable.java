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
        this.scope=1;
    }

    public void reset() {
        this.scope=0;
    }

    public boolean insert(Definition definition) {
        return true;
    }


    //no tiene q devolver la primera q encuentra
    //recorrer al revés
    public Definition find(String id) {
        for (var map: table) {
            for (var key: map.keySet()) {
                if (key.equals(id)) {
                    return map.get(key);
                }
            }
        }

        return null;
    }

    public Definition findInCurrentScope(String id) {
        for (var map: table) {
            for (var key: map.keySet()) {

            }
        }

        return null;
    }
}
