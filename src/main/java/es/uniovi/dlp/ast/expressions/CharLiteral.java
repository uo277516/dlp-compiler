package es.uniovi.dlp.ast.expressions;

public class CharLiteral extends AbstractExpression{

    private char value;

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public CharLiteral(int line, int column, char value)
    {
        super(line, column);
        this.value=value;
    }

}
