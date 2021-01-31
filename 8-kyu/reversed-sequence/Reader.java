import java.util.Scanner;

public class Reader {

    private static final String WARNING_MESSAGE = "Please enter positive number";

    public static int readNumber() {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number <= 0) {
            System.out.println(WARNING_MESSAGE);
            number = Integer.parseInt(scanner.nextLine());
        }

        return number;
    }
}
