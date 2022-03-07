package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.RecordField;
import es.uniovi.dlp.ast.definitions.VarDef;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractType{
    private List<RecordField> defs;

    public StructType (int line, int column, List<RecordField> defs) {
        super(line, column);
        this.defs=defs;
    }

    public List<RecordField> getDefs() {
        return defs;
    }

    public void setDefs(List<RecordField> defs) {
        this.defs = defs;
    }
}
