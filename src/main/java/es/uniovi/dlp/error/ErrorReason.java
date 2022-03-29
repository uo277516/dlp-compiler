package es.uniovi.dlp.error;

public enum ErrorReason {
    FIELD_ALREADY_DECLARED("Field already declared in struct"),
    LVALUE_REQUIRED("Value required"),
    VARIABLE_ALREADY_DECLARED("Variable already declared"),
    FUNCTION_ALREADY_DECLARED("Function already declared"),
    VARIABLE_NOT_DECLARED("Variable is not declared"),
    FUNCTION_NOT_DECLARED("Function is not declared"),
    INVALID_INDEX_EXPRESSION("The index expression is not valid"),
    INVALID_CAST("The cast is invalid"),
    INVALID_INDEXING("The index is invalid"),
    INVALID_ARITHMETIC("This arithmetic operation is invalid"),
    NOT_LOGICAL("The operation is not logical"),
    INVALID_LOGICAL("The logical operation is invalid"),
    INVALID_COMPARISON("The comparison is invalid"),
    NO_SUCH_FIELD("There is not such field"),
    INVALID_DOT("The dot is invalid"),
    INCOMPATIBLE_TYPES("The types are not compatible"),
    INVALID_RETURN_TYPE("The return type is not valid"),
    INVALID_ARGS("The args are invalid"),
    INVALID_INVOCATION("The invocation is invalid")
    ;

    private final String message;

    ErrorReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
