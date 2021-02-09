
import java.util.Arrays;

public class Positives {

    public static int sum(int[] arr) {

        return arr.length != 0 ? Arrays.stream(arr).filter(e -> e > 0).sum() : 0;

    }
}