public class Main {

    public static void main(String[] args) {

        int hour = Reader.readHour();

        int minutes = Reader.readMinutes();

        int seconds = Reader.readSeconds();

        System.out.println(Clock.Past(hour, minutes, seconds));

    }
}
