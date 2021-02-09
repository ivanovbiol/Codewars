public class Main {

    public static void main(String[] args) {

        int cap = Reader.readNumber();
        int on = Reader.readNumber();
        int wait = Reader.readNumber();

        System.out.println(Bob.enough(cap, on, wait));

    }
}