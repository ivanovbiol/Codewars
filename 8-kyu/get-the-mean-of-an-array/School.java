import java.util.Arrays;

public class School {

    public static final String INVALID_INPUT_WITH_ZERO_MARKS = "Invalid input. No zero marks allowed";
    public static final String INVALID_INPUT_NULL = "Invalid input. Null can't be an input";
    public static final String INVALID_INPUT_EMPTY_ARRAY = "Invalid input. Array can't be empty";
    public static final String INVALID_INPUT_NEGATIVE_NUMBER = "Invalid input. Array can't contains negative number";
    public static final String INVALID_INPUT_NUMBER_OUT_OF_RANGE = "Invalid input. Array can't contains number greater than 6";

    public static int getAverage(int[] marks) {
        validateInput(marks);

            return (int) Arrays
                .stream(marks)
                .average()
                .orElse(0);
    }

    private static void validateInput(int[] marks) {
        if (marks == null) {
            throw new NullPointerException(INVALID_INPUT_NULL);
        } else if (marks.length == 0) {
            throw new IllegalArgumentException(INVALID_INPUT_EMPTY_ARRAY);
        } else if (thereAreZeroMarks(marks)) {
            throw new IllegalArgumentException(INVALID_INPUT_WITH_ZERO_MARKS);
        } else if (containsNegativeNumber(marks)) {
            throw new IllegalArgumentException(INVALID_INPUT_NEGATIVE_NUMBER);
        } else if (containsGreaterThanSix(marks)) {
            throw new IllegalArgumentException(INVALID_INPUT_NUMBER_OUT_OF_RANGE);
        }
    }

    private static boolean containsGreaterThanSix(int[] marks) {
        return Arrays
                .stream(marks)
                .anyMatch(e -> e > 6);
    }

    private static boolean containsNegativeNumber(int[] marks) {
        return Arrays
                .stream(marks)
                .anyMatch(e -> e < 0);
    }

    private static boolean thereAreZeroMarks(int[] marks) {
        return Arrays
                .stream(marks)
                .anyMatch(e -> e == 0);
    }
}