import java.util.Scanner;

public class ZywOo {

    private static final String SHEEP_IS_GOING_TO_BE_EATEN = "Oi! Sheep number %s! You are about to be eaten by a wolf!";
    private static final String GO_AWAY_WOLF = "Pls go away and stop eating my sheep";
    private static final String WOLF = "wolf";

    public static void main(String[] args) {

        String[] inputArray = readInputArray();

        System.out.println(warnTheSheep(inputArray));

    }

    public static String[] readInputArray() {

        return new Scanner(System.in)
                .nextLine()
                .split(", ");
    }

    public static String warnTheSheep(String[] array) {

        return array[array.length - 1].equals(WOLF) ? GO_AWAY_WOLF

                : String.format(SHEEP_IS_GOING_TO_BE_EATEN,

                        findIndex(array));
    }

    public static int findIndex(String[] array) {

        int index = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i].equals(WOLF)) {

                index = (array.length - 1) - i;

                break;
            }
        }

        return index;
    }
}