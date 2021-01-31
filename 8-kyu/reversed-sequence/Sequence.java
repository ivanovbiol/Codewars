import java.util.Arrays;
import java.util.Comparator;

public class Sequence {

    public static int[] reverse(int n) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        return Arrays
                .stream(arr)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

}