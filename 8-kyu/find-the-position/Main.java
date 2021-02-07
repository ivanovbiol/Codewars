import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.nextLine();

        System.out.println(Kata.position(letter.charAt(0)));

    }

}
