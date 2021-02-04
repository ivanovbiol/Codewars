public class Dinglemouse {

    public static int[] paintLetterboxes(final int start, final int end) {
        int[] arr = new int[10];

        for (int i = start; i <= end; i++) {
            countDigitsAndAddInArr(i, arr);
        }

        return arr;
    }

    private static void countDigitsAndAddInArr(int number, int[] arr) {
        while (number > 0) {
            int remainder = number % 10;

            number = number / 10;

            arr[remainder]++;
        }
    }
}