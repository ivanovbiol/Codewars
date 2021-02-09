import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Object[] input = Reader.readArrayOfObjects();

        System.out.println(
                Arrays
                        .toString(DoubleSort.dbSort(input))
                        .replace("[", " ")
                        .replace("]", " ")
                        .trim()
                        );

    }
}