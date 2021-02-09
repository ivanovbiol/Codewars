import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static int[] readArray() {

        String input = new Scanner(System.in).nextLine();

        return input.equals("[]") ? new int[0]
                : Arrays.stream(input.replace("[", " ").replace("]", " ").trim().split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

    }
}