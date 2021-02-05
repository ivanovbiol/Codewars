import java.util.Scanner;

public class Reader {

    public static int readScreenWidth() {

        Scanner scanner = new Scanner(System.in);

        return Integer.parseInt(scanner.nextLine());
    }

    public static String readScreenRatio() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }


}
