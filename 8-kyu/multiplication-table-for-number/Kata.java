class Kata {

    public static final String INVALID_NUMBER_INPUT = "Number can't be smaller than 1 and greater than 10";

    public static String multiTable(int number) {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException(INVALID_NUMBER_INPUT);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            sb
                    .append(i)
                    .append(" * ")
                    .append(number)
                    .append(" = ")
                    .append(i * number)
                    .append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}