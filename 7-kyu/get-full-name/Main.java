public class Main {

    public static void main(String[] args) {

        String firstName = Reader.readFirstName();

        String lastName = Reader.readLastName();

        Dinglemouse dinglemouse = new Dinglemouse(firstName, lastName);

        System.out.println(dinglemouse.getFullName());

    }
}
