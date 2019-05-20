import java.util.ArrayList;

public class GradStudent extends Student{
    private ArrayList<Publication> publications = new ArrayList<>();
    private Professor advisor;

    public GradStudent(String firstName, String lastName, String ID, int joiningYear, Department department, Professor professor) {
        super(firstName, lastName, ID, joiningYear, department);
        this.advisor = professor;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public Professor getAdvisor() {
        return advisor;
    }

    public void addPublication(Publication publication) {
        this.publications.add(publication);
    }
}
