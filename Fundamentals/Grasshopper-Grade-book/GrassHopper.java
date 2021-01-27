//import java.util.stream.IntStream;

public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        //We can work with IntStream if we write the program in IntelliJ IDEA and if we have double result with the input numbers
        //double result = IntStream.of(s1, s2, s3).average().orElse(0.0);

        int result = (s1 + s2 + s3) / 3;

        return (result < 60) ? 'F' : (result < 70) ? 'D' : (result < 80) ? 'C': (result < 90) ? 'B' : 'A';
    }
}
