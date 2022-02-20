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
        double number = 0;

        return -1;
    }

    public static char lexemeToChar(String lexeme) {
        return Character.MIN_VALUE;
    }

}
