public class Ascii {

    public static final String INVALID_NUMBER_MESSAGE = "The input number should be between 0 and 127";

    public static char getChar(int inputNumber) {
        if (isInvalidInputNumber(inputNumber)) {
            throw new IllegalArgumentException(INVALID_NUMBER_MESSAGE);
        }

        return (char) inputNumber;
    }

    private static boolean isInvalidInputNumber(int inputNumber) {
        return inputNumber < 0 || inputNumber > 127;
    }
}