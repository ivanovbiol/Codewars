public class SquareDigit {

    public static int squareDigits(int n) {

        StringBuilder sb = new StringBuilder();

        String inputNumberAsString = String.valueOf(n);

        for (int i = 0; i < inputNumberAsString.length(); i++) {
            sb.append(Integer.parseInt(inputNumberAsString.charAt(i) + "") * Integer.parseInt(inputNumberAsString.charAt(i) + ""));
        }

        return Integer.parseInt(sb.toString());

    }

}
