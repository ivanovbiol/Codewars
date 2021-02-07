import java.util.Scanner;

public class Reader {

    public static String[] readInputArray() {

        return new Scanner(System.in)
                .nextLine()
                .replace("[", " ")
                .replace("]", " ")
                .replace("\"", " ")
                .trim()
                .split("\\s+,\\s+ ");

    }

}
