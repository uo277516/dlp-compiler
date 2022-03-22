package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.RecordField;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this,param);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StructType that = (StructType) o;
        return Objects.equals(defs, that.defs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defs);
    }
}
