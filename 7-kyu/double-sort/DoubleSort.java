import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class DoubleSort {

    public static Object[] dbSort(Object[] inputArr) {

        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < inputArr.length; i++) {

            try {

                int number = Integer.parseInt(inputArr[i].toString());
                integerList.add(number);

            } catch (NumberFormatException ex) {

                stringList.add(inputArr[i].toString());

            }
        }

        Collections.sort(integerList);
        Collections.sort(stringList);

        return Stream.of(integerList, stringList)
                .flatMap(Collection::stream).toArray();

    }
}
