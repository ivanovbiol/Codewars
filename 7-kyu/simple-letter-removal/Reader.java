import java.util.Scanner;

public class Reader {


    public static String readInputString() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static int readInputInt() {

        Scanner scanner = new Scanner(System.in);

        return Integer.parseInt(scanner.nextLine());
    }
}
