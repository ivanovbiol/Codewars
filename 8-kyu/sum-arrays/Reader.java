import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static double[] readArray() {
        Scanner scanner = new Scanner(System.in);

        String nextLine = scanner.nextLine();

        return
                nextLine.equals("[]") ? new double[0] :

                        Arrays.stream(nextLine
                                .replace(",", " ")
                                .replace("[", " ")
                                .replace("]", " ")
                                .trim()
                                .split("\\s+"))
                                .mapToDouble(Double::parseDouble)
                                .toArray();
    }
}
