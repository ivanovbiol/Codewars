import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int start = Reader.readStartOrStop();

        int stop = Reader.readStartOrStop();

        System.out.println(
                Arrays
                        .toString(Dinglemouse.paintLetterboxes(start, stop))
                        .replace("[", " ")
                        .replace("]", " ")
                        .replace(", ", " ")
                        .trim()
        );

    }
}
