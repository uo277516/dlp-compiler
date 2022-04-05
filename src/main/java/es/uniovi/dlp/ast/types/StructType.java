package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.RecordField;
import es.uniovi.dlp.ast.definitions.VarDef;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class StructType extends AbstractType{
    private List<RecordField> defs;

    public StructType (int line, int column, List<RecordField> defs) {
        super(line, column);
        checkDuplicatedRecords(defs);
        this.defs=defs;
    }

    public void checkDuplicatedRecords(List<RecordField> defs) {
        HashSet<String> set = new HashSet<>();
        for (var def: defs) {
            if (!set.add(def.getId())) {
                Error e = new Error(def.getLine(), def.getColumn(), ErrorReason.FIELD_ALREADY_DECLARED);
                ErrorManager.getInstance().addError(e);
            }
        }
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

    @Override
    public Type cast(Type from) { //this es el tipo de la expression y from tipo a castear
        return null;
    }

    @Override
    public Type dot(String field) {
        for(RecordField f : defs)
            if(f.getId().equals(field))
                return f.getType();

        return null;
    }

    @Override
    public boolean allowDot() {
        return true;
    }

    @Override
    public int getNumberOfBytes() {
        int bytes= 0;
        for(RecordField r : defs)
            bytes += r.getType().getNumberOfBytes();

        return bytes;
    }
}
