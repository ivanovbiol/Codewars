
public class Kata {

    public static int[] invert(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] != 0 ? -array[i] : 0;
        }

        return newArray;

    }
}
