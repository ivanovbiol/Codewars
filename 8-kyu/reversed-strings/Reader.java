import java.util.Scanner;

public class Reader {

    public static String readString() {
        Scanner scanner = new Scanner(System.in);

        return scanner
                .nextLine()
                .replace("'", "")
                .trim();
    }
}
