import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static Object[] readArrayOfObjects() {

        return Arrays.stream(new Scanner(System.in).nextLine().split(", ")).toArray();

    }
}