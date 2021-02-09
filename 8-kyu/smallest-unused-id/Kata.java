import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {

    public static int nextId(int[] ids) {

        List<Integer> integerList = new ArrayList<>();

        Arrays.stream(ids).forEach(e -> {

            if (!integerList.contains(e)) {
                integerList.add(e);
            }

        });

        Collections.sort(integerList);

        return integerList.size() == 0 ? 0 : findSmallestId(integerList);

    }

    public static int findSmallestId(List<Integer> integerList) {

        int counter = 0;

        for (int i = 0; i < integerList.size(); i++) {
            if (counter != integerList.get(i)) {
                return counter;
            }
            counter++;
        }

        return integerList.get(integerList.size() - 1) + 1;

    }
}