import java.util.Scanner;

public class Main {

    public static final String INVALID_HOUR_MESSAGE = "Invalid hour (range from 0 till 23)";
    public static final String INVALID_MINUTES_MESSAGE = "Invalid minutes (range from 0 till 59)";
    public static final String INVALID_SECONDS_MESSAGE = "Invalid seconds (range from 0 till 59)";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = readHour(scanner);

        int minutes = readMinutes(scanner);

        int seconds = readSeconds(scanner);

        System.out.println(Clock.Past(hour, minutes, seconds));

    }

    private static int readHour(Scanner scanner) {
        int hour = Integer.parseInt(scanner.nextLine());

        while (isNotValidHour(hour)) {

            System.out.println(INVALID_HOUR_MESSAGE);
            hour = Integer.parseInt(scanner.nextLine());

        }

        return hour;
    }

    private static int readMinutes(Scanner scanner) {
        int minutes = Integer.parseInt(scanner.nextLine());

        while (areNotValidMinutesAndSeconds(minutes)) {

            System.out.println(INVALID_MINUTES_MESSAGE);
            minutes = Integer.parseInt(scanner.nextLine());

        }

        return minutes;
    }

    private static int readSeconds(Scanner scanner) {
        int seconds = Integer.parseInt(scanner.nextLine());

        while (areNotValidMinutesAndSeconds(seconds)) {

            System.out.println(INVALID_SECONDS_MESSAGE);
            seconds = Integer.parseInt(scanner.nextLine());

        }

        return seconds;
    }

    private static boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    private static boolean areNotValidMinutesAndSeconds(int minutesOrSeconds) {
        return minutesOrSeconds < 0 || minutesOrSeconds > 59;
    }

}
