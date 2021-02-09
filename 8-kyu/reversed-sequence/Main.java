import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int number = Reader.readNumber();

        System.out.println(
                Arrays
                        .toString(Sequence.reverse(number))
                        .replace("[", " ")
                        .replace("]", " ")
                        .trim());

    }
}