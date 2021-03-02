public class Cockroach {

    public static int cockroachSpeed(double x) {
        if (x < 0.0) {
            throw new NumberFormatException("Speed can't be negative");
        }

        // Formula used for conversion : km/h ÷ 0.036 = cm/s
        return (int) (x / 0.036);

    }
}