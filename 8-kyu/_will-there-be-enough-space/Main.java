import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cap = Integer.parseInt(scanner.nextLine());
        int on = Integer.parseInt(scanner.nextLine());
        int wait = Integer.parseInt(scanner.nextLine());

        System.out.println(Bob.enough(cap, on, wait));

    }

}
