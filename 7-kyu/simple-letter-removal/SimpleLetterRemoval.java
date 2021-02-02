public class SimpleLetterRemoval {

    public static String solve(String inputString, int number) {

        char queryChar = 'a';

        for (int i = 0; i < number; i++) {

            if (inputString.isEmpty()) {
                return null;
            }

            if (inputString.contains(queryChar + "")) {

                inputString = inputString.replaceFirst(queryChar + "", "");

            } else {

                while (!inputString.contains(queryChar + "")) {
                    queryChar += 1;
                }

                inputString = inputString.replaceFirst(queryChar + "", "");

            }
        }

        return inputString;
    }
}