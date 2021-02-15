import java.util.Scanner;

public class Kata {

    public static void main(String[] args) {

        String inputString = readInputString();

        System.out.println(vowel2Index(inputString));

    }

    public static String readInputString() {

        return new Scanner(System.in).nextLine();

    }

    public static String vowel2Index(String inputString) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {

            if ("aeiouAEIOU".indexOf(inputString.charAt(i)) == -1) {

                sb.append(inputString.charAt(i));

            } else {

                sb.append(i + 1);

            }
        }

        return sb.toString();

    }
}