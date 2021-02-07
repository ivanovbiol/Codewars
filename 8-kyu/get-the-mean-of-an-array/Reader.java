import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    /*
     * Note: The reading of the input depends on the format of the input and can be changed.
     * There is no Main class in codewars.com.
     */

    public static int[] readInputGrades() {

        return Arrays.stream(new Scanner(System.in)
                .nextLine()
                .split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
