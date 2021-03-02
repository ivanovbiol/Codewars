public class Kata {

    public static final String LETTER_POSITION_STRING_MESSAGE = "Position of alphabet: ";
    public static final String INVALID_LETTER_MESSAGE = "Invalid letter";

    public static String position(char alphabet) {
        if (isValidLetter(alphabet)) {
            return alphabet >= 97 ? LETTER_POSITION_STRING_MESSAGE + (alphabet - ('a' - 1))
                    : LETTER_POSITION_STRING_MESSAGE + (alphabet - ('A' - 1));
        }

        throw new IllegalArgumentException(INVALID_LETTER_MESSAGE);
    }

    public static boolean isValidLetter(char alphabet) {
        return alphabet >= 'a' && alphabet <= 'z' || alphabet >= 'A' && alphabet <= 'Z';
    }
}