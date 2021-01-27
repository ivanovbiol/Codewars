import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] intArr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println(FirstNonConsecutive.find(intArr));

    }

}
