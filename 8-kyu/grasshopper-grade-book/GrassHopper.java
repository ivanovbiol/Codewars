import java.util.stream.IntStream;

public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {

        int result = (int) IntStream.of(s1, s2, s3).average().orElse(0.0);

        return (result < 60) ? 'F' : (result < 70) ? 'D' : (result < 80) ? 'C': (result < 90) ? 'B' : 'A';

    }
}