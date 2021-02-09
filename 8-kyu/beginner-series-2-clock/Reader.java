import java.util.Scanner;

public class Reader {

    private static final String INVALID_HOUR_MESSAGE = "Invalid hour (range from 0 till 23)";
    private static final String INVALID_MINUTES_MESSAGE = "Invalid minutes (range from 0 till 59)";
    private static final String INVALID_SECONDS_MESSAGE = "Invalid seconds (range from 0 till 59)";

    public static int readHour() {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());

        while (isNotValidHour(hour)) {

            System.out.println(INVALID_HOUR_MESSAGE);
            hour = Integer.parseInt(scanner.nextLine());

        }

        return hour;
    }

    public static int readMinutes() {

        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());

        while (areNotValidMinutesAndSeconds(minutes)) {

            System.out.println(INVALID_MINUTES_MESSAGE);
            minutes = Integer.parseInt(scanner.nextLine());

        }

        return minutes;
    }

    public static int readSeconds() {

        Scanner scanner = new Scanner(System.in);

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