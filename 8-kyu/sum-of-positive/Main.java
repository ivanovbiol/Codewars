public class Main {

    public static void main(String[] args) {

        int[] intArr = Reader.readArray();

        System.out.println(Positives.sum(intArr));

    }
}