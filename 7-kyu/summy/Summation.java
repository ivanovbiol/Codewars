class Summation {

    static long summy(String stringOfInts) {

        long result = 0L;

        String[] arr = stringOfInts.split("\\s+");

        for (int i = 0; i < arr.length; i++) {

            try {

                long value = Long.parseLong(arr[i]);
                result += Long.parseLong(arr[i] + "");

            } catch (NumberFormatException ex) {

                continue;

            }

        }

        return result;
    }
}