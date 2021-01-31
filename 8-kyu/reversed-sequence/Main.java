import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int number = Reader.readNumber();

        // I won't remove the brackets and the commas from the printed output
        System.out.println(Arrays.toString(Sequence.reverse(number)));
    }


}
