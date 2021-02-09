class Kata {

    public static String multiTable(int number) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            sb.append(i).append(" * ").append(number).append(" = ").append(i * number)
                    .append(System.lineSeparator());

        }

        return sb.toString().trim();
    }
}