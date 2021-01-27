import java.util.Arrays;

public class CharProblem {

    public static int howOld(final String herOld) {

        return Integer.parseInt(Arrays.asList(herOld.split("\\s+")).get(0));

    }

}

