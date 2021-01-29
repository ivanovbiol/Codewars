import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZywOo {

    public static int sumOfDifferences(int[] arr) {

        List<Integer> integerList = new ArrayList<>();

        Arrays.stream(arr).forEach(integerList::add);

        Collections.sort(integerList);
        Collections.reverse(integerList);

        return (integerList.size() <= 1) ? 0 : returnSum(integerList);
    }

    private static int returnSum(List<Integer> integerList) {
        int sum = 0;

        for (int i = 0; i < integerList.size() - 1; i++) {
            int currentPair = integerList.get(i) - integerList.get(i + 1);
            sum += currentPair;
        }

        return sum;
    }
}