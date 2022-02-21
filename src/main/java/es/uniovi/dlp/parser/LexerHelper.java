package es.uniovi.dlp.parser;

public class LexerHelper {
    public static int lexemeToInt(String lexeme) {
        try {
            return Integer.parseInt(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static double lexemeToReal(String lexeme) {
        return Double.parseDouble(lexeme);
    }

    public static char lexemeToChar(String lexeme) {
        char c = Character.MIN_VALUE;
        try {
            c = numberFormat(lexeme);
        } catch(NumberFormatException e) {
            c = stringFormat(lexeme);
        }
        return c;
    }

    private static char numberFormat(String str) {
        int value = Integer.parseInt(str.substring(2, str.length() - 1));
        return (char) value;
    }

    private static char stringFormat(String str) {
        if ("'\\n'".equals(str)) {
            return '\n';
        }
        if ("'\\t'".equals(str)) {
            return '\t';
        } else {
            return str.charAt(1);
        }
    }

}
