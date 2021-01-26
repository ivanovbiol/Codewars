public class Kata {

    public static int quarterOf(int month) {

        return (month >= 1 && month <= 3) ? 1 : (month >= 4 && month <= 6) ? 2 : (month >= 7 && month <= 9) ? 3 : (month >= 10 && month <= 12) ? 4 : 0;
    }

}
