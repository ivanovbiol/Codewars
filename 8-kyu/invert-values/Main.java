import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = Reader.readIntegerArray();

        System.out.println(Arrays
                .toString(Kata.invert(arr))
                .replace("[", " ")
                .replace("]", " ")
                .trim());

    }
}