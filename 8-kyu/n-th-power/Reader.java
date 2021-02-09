import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static int[] readArrayOfNumbers() {

        return Arrays.stream(new Scanner(System.in).nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

    }

    public static int readNumber() {

        return Integer.parseInt(new Scanner(System.in).nextLine());

    }
}