import java.util.Scanner;

public class FakeBinary {

    public static void main(String[] args) {

        String numberString = readInputString();

        System.out.println(fakeBin(numberString));

    }

    public static String readInputString() {

        return new Scanner(System.in).nextLine();

    }

    public static String fakeBin(String numberString) {

        return numberString.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1");

    }
}