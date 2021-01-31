import java.util.Scanner;

public class Reader {

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);

        return Integer.parseInt(scanner.nextLine());
    }
}
