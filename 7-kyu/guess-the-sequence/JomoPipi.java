import java.util.Arrays;
import java.util.Scanner;

class JomoPipi {

    public static void main(String[] args) {

        int number = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println(Arrays
                .toString(sequence(number))
                .replace("[", " ")
                .replace("]", " ")
                .trim());

    }

    public static int[] sequence(int x) {

        String[] temp = new String[x];

        for (int i = 0; i < temp.length; i++) {

            temp[i] = String.valueOf(i + 1);
            
        }

        return Arrays
                .stream(temp)
                .sorted()
                .mapToInt(Integer::valueOf)
                .toArray();

    }
}