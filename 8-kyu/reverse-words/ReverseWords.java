import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String reverseWords(String str) {

        List<String> tempCollection = Arrays.asList(str.split("\\s+"));

        Collections.reverse(tempCollection);

        return tempCollection.toString()
                .replace("[", " ")
                .replace("]", " ")
                .replace(",", "")
                .trim();

    }
}