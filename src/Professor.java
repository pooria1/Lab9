import java.util.ArrayList;

public class Professor extends AbstractEmployee{
    private ArrayList<Course> courses;
    private String group;
    private int income;

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Professor(String firstName, String lastName, String ID, int joiningYear, int income, Department department, String position, double basicIncome, String group) {
        super(firstName, lastName, ID, joiningYear, department, position, basicIncome);
        courses = new ArrayList<>();
        this.group = group;
        this.income = income;
    }

    public String getGroup() {
        return group;
    }
    public boolean calCurrentIncome() {
        return true;
    }
    public boolean isPromotable() {
        return true;
    }

    public void addCourse (Course course) {
        this.courses.add(course);
    }

    public int getIncome() {
        return income;
    }

    public void addIncome (int income) {
        this.income += income;
    }
}
