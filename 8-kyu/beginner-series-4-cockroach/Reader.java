import java.util.Scanner;

public class Reader {

    public static double readRealNumber() {
        Scanner scanner = new Scanner(System.in);

        return Double.parseDouble(scanner.nextLine());
    }
}
