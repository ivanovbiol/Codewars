public class Clock {

    public static int Past(int h, int m, int s) {
        if (h > 23) {
            throw new NumberFormatException("Invalid hour");
        } else if (m > 59) {
            throw new NumberFormatException("Invalid minutes");
        } else if (s > 59) {
            throw new NumberFormatException("Invalid seconds");
        }

        return (s * 1000) + (m * 60 * 1000) + (h * 60 * 60 * 1000);

    }
}