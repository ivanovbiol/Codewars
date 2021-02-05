public class Main {

    public static void main(String[] args) {

        int width = Reader.readScreenWidth();

        String ratio = Reader.readScreenRatio();

        System.out.println(Kata.findScreenHeight(width, ratio));

    }
}
