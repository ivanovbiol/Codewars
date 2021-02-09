import java.util.Arrays;

public class Writer {

    public static void printResult(String[][] result) {

        StringBuilder sb = new StringBuilder();

        for (String[] temp : result) {

            sb.append(Arrays
                    .toString(temp)
                    .replace("[", " ")
                    .replace("]", " ")
                    .trim());

            sb.append(System.lineSeparator());

        }

        System.out.println(sb.toString());

    }
}
