public class Main {

    public static void main(String[] args) {

        String firstName = Reader.readFirstOrLastName();

        String lastName = Reader.readFirstOrLastName();

        Dinglemouse dinglemouse = new Dinglemouse(firstName, lastName);

        System.out.println(dinglemouse.getFullName());

    }
}