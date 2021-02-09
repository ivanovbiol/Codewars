import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static int[] readInputGrades() {

        return Arrays.stream(new Scanner(System.in)
                .nextLine()
                .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

    }
}