import java.util.ArrayList;

public class Student extends Person {
    protected ArrayList<Course> courses;

    public Student(String firstName, String lastName, String ID, int joiningYear, Department department) {
        super(firstName, lastName, ID, joiningYear, department);
        courses = new ArrayList<>();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse (Course course) {
        this.courses.add(course);
    }


}
