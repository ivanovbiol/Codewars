class Kata {

    public static String findScreenHeight(int width, String ratio) {

        Double result = width / (1.0 * (Integer.parseInt(ratio.split(":")[0])) / Integer
                .parseInt(ratio.split(":")[1]));

        return width + "x" + result.intValue();

    }
}