public class Main {

    public static void main(String[] args) {

        String firstString = Reader.readInputString();

        String secondString = Reader.readInputString();

        System.out.println(TwoToOne.longest(firstString, secondString));
    }
}
