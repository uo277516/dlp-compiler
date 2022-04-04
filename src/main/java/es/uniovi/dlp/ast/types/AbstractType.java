package es.uniovi.dlp.ast.types;

public abstract class AbstractType implements Type {
    private int line;
    private int column;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public AbstractType(int line, int column) {
        this.line=line;
        this.column=column;
    }


    //compraciones con enteros else if (left.promotable(this) or left.promotable(this)


    @Override
    public Type arithmetic(Type type) {
        if (type instanceof  ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type logical(Type type) {
        if (type instanceof  ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type indexing(Type type) {
        if (type instanceof  ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type dot(String field) {
        return null;
    }

    @Override
    public Type cast(Type from) {
        if (from instanceof  ErrorType) {
            return from;
        }
        return null;
    }

    @Override
    public Type comparison(Type leftType) {
        if (leftType instanceof  ErrorType) {
            return leftType;
        }
        return null;
    }

    @Override
    public boolean promotableTo(Type to) {
        return false;
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public boolean isIndexable() {
        return false;
    }

    @Override
    public boolean isArithmetic() {
        return false;
    }

    @Override
    public boolean allowDot() {
        return false;
    }
}
