import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sb = new StringBuilder();

        Arrays.stream(Kata.invert(arr)).forEach(value -> {
            sb.append(value).append(" ");
        });

        System.out.println(sb.toString().trim());
    }

}
