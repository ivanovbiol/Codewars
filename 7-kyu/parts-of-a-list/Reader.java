import java.util.Scanner;

public class Reader {

    public static String[] readInputArray() {

        return new Scanner(System.in).nextLine().split(" ");

    }
}