public class Main {

    public static void main(String[] args) {

        String[] input = Reader.readInputArray();

        String[][] result = Partlist.partlist(input);

        Writer.printResult(result);

    }
}