import java.util.HashMap;
import java.util.Map;

public class Kata {

    private static final String LEFT_SIDE_MESSAGE = "Left side wins!";
    private static final String RIGHT_SIDE_MESSAGE = "Right side wins!";
    private static final String NOBODY_WINS = "Let's fight again!";


    public static String alphabetWar(String fight) {

        if (fight.trim().isEmpty()) {
            return NOBODY_WINS;
        }

        Map<Character, Integer> leftSideLetters = new HashMap<>();
        Map<Character, Integer> rightSideLetters = new HashMap<>();

        leftSideLetters.put('w', 4);
        leftSideLetters.put('p', 3);
        leftSideLetters.put('b', 2);
        leftSideLetters.put('s', 1);

        rightSideLetters.put('m', 4);
        rightSideLetters.put('q', 3);
        rightSideLetters.put('d', 2);
        rightSideLetters.put('z', 1);

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < fight.length(); i++) {

            leftSum += leftSideLetters.getOrDefault(fight.charAt(i), 0);
            rightSum += rightSideLetters.getOrDefault(fight.charAt(i), 0);

        }

        return (leftSum == rightSum) ? NOBODY_WINS : (leftSum > rightSum) ? LEFT_SIDE_MESSAGE : RIGHT_SIDE_MESSAGE;

    }
}