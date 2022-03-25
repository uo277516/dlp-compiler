package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;

import java.util.*;

//cuando visito una variable, hay que asinarle su definicion
//

public class SymbolTable {
    private int scope = 0;
    private List<Map<String, Definition>> table;

    public SymbolTable() {
        table = new ArrayList<>();
        table.add(new HashMap<>());
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "scope=" + scope +
                ", table=" + table +
                '}';
    }

    public void set() {
        this.scope=1;
        table.add(new HashMap<String, Definition>());
    }

    public void reset() {
        if (table.size()>1) {
            table.remove(1);
            this.scope = 0;
        }
    }

    public boolean insert(Definition definition) {
        if (!table.get(scope).containsKey(definition.getId())) {
            table.get(scope).put(definition.getId(), definition);
            definition.setScope(this.scope);
            System.out.println(definition.getId());
            return true;
        }
        return false;
    }


    //tiene que devolver la más "concreta"-> 1
    public Definition find(String id) {
        if (table.get(scope).containsKey(id))
            return table.get(scope).get(id);
        else if (table.get(0).containsKey(id))
            return table.get(0).get(id);
        else return null;
    }

    public Definition findInCurrentScope(String id) {
        return table.get(scope).get(id);
    }
}
