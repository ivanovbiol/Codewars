import java.util.LinkedHashSet;
import java.util.Set;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        String wholeString = s1 + s2;

        Set<Integer> number = new LinkedHashSet<>();

        for (int i = 0; i < wholeString.length(); i++) {

            number.add((int) (wholeString.charAt(i)));

        }

        StringBuilder sb = new StringBuilder();

        number
                .stream()
                .sorted()
                .forEach(e -> sb.append(Character.toString(e)));

        return sb.toString();

    }
}