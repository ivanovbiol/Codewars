import java.util.Arrays;

public class Partlist {

    public static String[][] partlist(String[] arr) {

        String[][] returnResult = new String[arr.length - 1][];

        for (int i = 0; i < arr.length - 1; i++) {

            String[] temp = new String[1];

            String leftHalf = Arrays.toString(Arrays.copyOfRange(arr, 0, i + 1))
                    .replace("[", " ")
                    .replace("]", " ")
                    .replace(", ", " ")
                    .trim();

            String rightHalf = Arrays.toString(Arrays.copyOfRange(arr, i + 1, arr.length))
                    .replace("[", " ")
                    .replace("]", " ")
                    .replace(", ", " ")
                    .trim();

            temp[0] = leftHalf + ", " + rightHalf;

            returnResult[i] = temp;
        }

        return returnResult;
    }
}