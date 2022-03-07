package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.types.Type;

public class RecordField extends AbstractDefinition {

    private String id;
    private Type type;


    public RecordField ( int line, int column ,
                    String id, Type type)
    {
        super(line, column);
        this.id=id;
        this.type=type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
