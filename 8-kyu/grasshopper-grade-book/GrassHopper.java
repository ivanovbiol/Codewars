import java.util.stream.IntStream;

public class GrassHopper {

    public static final String INVALID_NEGATIVE_INPUT = "Negative values are invalid";
    public static final String INVALID_INPUT_GREATER_THAN_HUNDRED = "Values greater than 100 are invalid";

    public static char getGrade(int scoreOne, int scoreTwo, int scoreThree) {
        validateInput(scoreOne, scoreTwo, scoreThree);

        int result = (int) IntStream
                .of(scoreOne, scoreTwo, scoreThree)
                .average()
                .orElse(0.0);

        return (result < 60) ? 'F'
                : (result < 70) ? 'D' : (result < 80) ? 'C' : (result < 90) ? 'B' : 'A';
    }

    private static void validateInput(int scoreOne, int scoreTwo, int scoreThree) {
        if (inputContainsNegative(scoreOne, scoreTwo, scoreThree)) {
            throw new IllegalArgumentException(INVALID_NEGATIVE_INPUT);
        } else if (valuesAreGreaterThanHundred(scoreOne, scoreTwo, scoreThree)) {
            throw new IllegalArgumentException(INVALID_INPUT_GREATER_THAN_HUNDRED);
        }
    }

    private static boolean inputContainsNegative(int scoreOne, int scoreTwo, int scoreThree) {
        return IntStream
                .of(scoreOne, scoreTwo, scoreThree)
                .anyMatch(e -> e < 0);
    }

    private static boolean valuesAreGreaterThanHundred(int scoreOne, int scoreTwo, int scoreThree) {
        return IntStream
                .of(scoreOne, scoreTwo, scoreThree)
                .anyMatch(e -> e > 100);
    }
}