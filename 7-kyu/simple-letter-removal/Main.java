public class Main {

    public static void main(String[] args) {

        String inputString = Reader.readInputString();

        int number = Reader.readInputInt();

        System.out.println(SimpleLetterRemoval.solve(inputString, number));
    }
}
