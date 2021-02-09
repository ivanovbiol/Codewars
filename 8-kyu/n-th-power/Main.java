public class Main {

    public static void main(String[] args) {

        int[] arr = Reader.readArrayOfNumbers();

        int number = Reader.readNumber();

        System.out.println(Kata.nthPower(arr, number));

    }
}