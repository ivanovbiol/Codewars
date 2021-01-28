public class Kata {
    public static int nthPower(int[] array, int n) {
        return n >= (array.length) ? -1 : returnResult(array, n);
    }

    public static int returnResult(int[] array, int n) {
        return (int) Math.pow(array[n], n);
    }
}
