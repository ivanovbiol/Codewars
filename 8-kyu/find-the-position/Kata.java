public class Kata {

    public static final String LETTER_POSITION_STRING_MESSAGE = "Position of alphabet: ";

    public static String position(char alphabet) {

        return alphabet >= 97 ? LETTER_POSITION_STRING_MESSAGE + (alphabet - ('a' - 1))
                : LETTER_POSITION_STRING_MESSAGE + (alphabet - ('A' - 1));

    }
}
