import java.util.Scanner;

public class Reader {

    private static final String WARNING_MESSAGE = "Please enter a positive number";

    public static int readNumber() {

        int number = Integer.parseInt(new Scanner(System.in).nextLine());

        while (number <= 0) {

            System.out.println(WARNING_MESSAGE);

            number = Integer.parseInt(new Scanner(System.in).nextLine());

        }

        return number;
    }
}