package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.RecordField;
import es.uniovi.dlp.ast.definitions.VarDef;

import java.util.ArrayList;
import java.util.List;

public class StructType implements Type{
    private int line;
    private int column;
    private List<RecordField> defs;

    public StructType (int line, int column, List<RecordField> defs) {
        this.line=line;
        this.column=column;
        this.defs=defs;
    }


    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
