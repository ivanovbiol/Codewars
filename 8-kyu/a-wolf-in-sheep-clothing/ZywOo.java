import java.util.Arrays;
import java.util.Scanner;

public class ZywOo {

    public static final String SHEEP_IS_GOING_TO_BE_EATEN_MESSAGE = "Oi! Sheep number %s! You are about to be eaten by a wolf!";
    public static final String GO_AWAY_WOLF_MESSAGE = "Pls go away and stop eating my sheep";
    public static final String EMPTY_ARRAY_MESSAGE = "The input array can't be empty.";
    public static final String MORE_THAN_ONE_WOLF_MESSAGE = "There can be only wolf in the array";
    public static final String CONTAINS_ONLY_WOLFS_MESSAGE = "There can't be only wolfs in the array";
    public static final String CONTAINS_ONLY_SHEEP_MESSAGE = "There can't be only sheep in the array";
    public static final String CAN_CONTAIN_ONLY_WOLFS_AND_SHEEP_MESSAGE = "There can be only wolfs and sheep in the array";
    public static final String WOLF_MESSAGE = "wolf";
    public static final String SHEEP_MESSAGE = "sheep";

    public static void main(String[] args) {
        String[] inputArray = readInputArray();

        System.out.println(warnTheSheep(inputArray));
    }

    public static String[] readInputArray() {
        return new Scanner(System.in).nextLine().split(", ");
    }

    public static String warnTheSheep(String[] array) {

        if (array.length == 0) {
            return EMPTY_ARRAY_MESSAGE;
        } else if (doesNotContainsOnlyWolfsAndSheep(array)) {
            return CAN_CONTAIN_ONLY_WOLFS_AND_SHEEP_MESSAGE;
        } else if (containsOnlyWolfs(array)) {
            return CONTAINS_ONLY_WOLFS_MESSAGE;
        } else if (containsOnlySheep(array)) {
            return CONTAINS_ONLY_SHEEP_MESSAGE;
        } else if (moreThanOneWolf(array)) {
            return MORE_THAN_ONE_WOLF_MESSAGE;
        }

        return array[array.length - 1].equals(WOLF_MESSAGE) ? GO_AWAY_WOLF_MESSAGE :
                String.format(SHEEP_IS_GOING_TO_BE_EATEN_MESSAGE, findIndex(array));
    }

    public static int findIndex(String[] array) {
        int index = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i].equals(WOLF_MESSAGE)) {
                index = (array.length - 1) - i;
                break;
            }

        }

        return index;
    }

    public static boolean doesNotContainsOnlyWolfsAndSheep(String[] array) {
        return Arrays
                .stream(array)
                .anyMatch(e -> !e.equals(WOLF_MESSAGE) && !e.equals(SHEEP_MESSAGE));
    }

    public static boolean containsOnlyWolfs(String[] array) {
        return Arrays
                .stream(array)
                .noneMatch(e -> e.equals(SHEEP_MESSAGE));
    }

    public static boolean containsOnlySheep(String[] array) {
        return Arrays
                .stream(array)
                .noneMatch(e -> e.equals(WOLF_MESSAGE));
    }

    public static boolean moreThanOneWolf(String[] array) {
        return Arrays
                .stream(array)
                .filter(e -> e.equals(WOLF_MESSAGE))
                .count() > 1;
    }
}
