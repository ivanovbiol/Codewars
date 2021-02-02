public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {

        if (this.firstName.trim().equals("")) {
            return this.lastName;
        }

        if (this.lastName.trim().equals("")) {
            return this.firstName;
        }

        return firstName + " " + lastName;
    }

}