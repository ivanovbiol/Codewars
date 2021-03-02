public class Kata {

    public static final String NEGATIVE_NUMBER_MESSAGE = "Number input should be positive";
    public static final String MAX_NUMBER_SHOULD_BE_1023 = "Max number input should be 1023";

    public static int toBinary(int n) {
        if (n < 0) {
            throw new NumberFormatException(NEGATIVE_NUMBER_MESSAGE);
        }

        if (n >= 1024) {
            throw new NumberFormatException(MAX_NUMBER_SHOULD_BE_1023);
        }

        return Integer.parseInt(Integer.toBinaryString(n));
    }

}