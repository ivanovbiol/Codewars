import java.math.BigInteger;
import java.util.Scanner;

class CodeWars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long address = readLongInput(scanner);
        long streetLength = readLongInput(scanner);

        System.out.println(overTheRoad(address, streetLength));

    }

    public static long readLongInput(Scanner scanner) {

        return Long.parseLong(scanner.nextLine());

    }

    public static long overTheRoad(long address, long streetLength) {

        BigInteger addressBigInteger = new BigInteger(String.valueOf(address));
        BigInteger streetLengthBigInteger = new BigInteger(String.valueOf(streetLength));

        if (address == 1) {
            return streetLengthBigInteger
                    .multiply(new BigInteger(String.valueOf(2)))
                    .longValue();
        }

        if (addressBigInteger.equals(streetLengthBigInteger.multiply(streetLengthBigInteger))) {
            return address * 2;
        }

        // Used formula (the variables are the incoming parameters of the method):
        // ((streetLength * 2) - address) + 1
        BigInteger wholeStreetLength = streetLengthBigInteger.multiply(new BigInteger(String.valueOf(2)));

        return wholeStreetLength
                .subtract(addressBigInteger)
                .add(new BigInteger(String.valueOf(1)))
                .longValue();

    }
}