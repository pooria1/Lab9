import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Course> courses;

    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}

