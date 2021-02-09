public class FirstNonConsecutive {

    static Integer find(final int[] array) {

        for (int i = 1; i < array.length; i++) {

            if (array[i] - array[i - 1] > 1) {

                return Integer.valueOf(array[i]);

            }
        }

        return null;
    }
}