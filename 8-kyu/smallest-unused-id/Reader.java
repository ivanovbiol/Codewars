import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static int[] readIntegerArray() {

        return Arrays
                .stream(new Scanner(System.in).nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

    }
}