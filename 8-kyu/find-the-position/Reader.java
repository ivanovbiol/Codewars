import java.util.Scanner;

public class Reader {

    public static char readLetter() {

        return new Scanner(System.in).nextLine().charAt(0);

    }
}