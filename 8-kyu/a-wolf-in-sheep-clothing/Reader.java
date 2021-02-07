import java.util.Scanner;

public class Reader {

    /*
     * Note: The reading of the input depends on the format of the input and can be changed.
     * There is no Main class in codewars.com.
     */

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
