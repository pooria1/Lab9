
public class Person {
    protected String firstName;
    protected String lastName;
    protected String ID;
    protected int joiningYear;
    protected Department department;

    public String getFirstName() {
        return firstName;
    }

    public Person(String firstName, String lastName, String ID, int joiningYear, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.joiningYear = joiningYear;
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public Department getDepartment() {
        return department;
    }
}
