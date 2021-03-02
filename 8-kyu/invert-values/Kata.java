import java.util.Arrays;

public class Kata {

    public static final String INVALID_NULL_INPUT = "Input can't be null";

    public static int[] invert(int[] array) {
        validateInputNotNull(array);

        if (array.length == 0) {
            return new int[0];
        }

        if (array.length == 1 && array[0] == 0) {
            return array;
        }

        return Arrays
                .stream(array)
                .filter(e -> e != 0)
                .map(e -> -e)
                .toArray();
    }

    private static void validateInputNotNull(int[] array) {
        if (array == null) {
            throw new NullPointerException(INVALID_NULL_INPUT);
        }
    }
}