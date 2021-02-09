import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static int[] readArray() {

        Scanner scanner = new Scanner(System.in);

        String nextLine = scanner.nextLine();

        return nextLine.equals("[]") ? new int[0] :

                Arrays.stream(nextLine
                        .replace(",", " ")
                        .replace("[", " ")
                        .replace("]", " ")
                        .trim()
                        .split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

    }
}