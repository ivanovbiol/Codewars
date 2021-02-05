import java.util.stream.Stream;

public class Kata {

    public static String highAndLow(String numbers) {

        int max = Stream.of(numbers.split("\\s+")).mapToInt(Integer::valueOf).max().orElse(0);

        int min = Stream.of(numbers.split("\\s+")).mapToInt(Integer::valueOf).min().orElse(0);

        return max + " " + min;

    }
}