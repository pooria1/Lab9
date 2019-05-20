import java.util.ArrayList;

public abstract class AbstractEmployee extends Person {
    private ArrayList<Statement> statements;
    private String position;
    private double basicIncome;
    private Account account;

    public AbstractEmployee(String firstName, String lastName, String ID, int joiningYear, Department department, String position, double basicIncome) {
        super(firstName, lastName, ID, joiningYear, department);
        this.position = position;
        this.basicIncome = basicIncome;
        this.statements = new ArrayList<>();
        this.account = new Account(this);
    }

    abstract boolean calCurrentIncome();

    abstract boolean isPromotable();

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public String getPosition() {
        return position;
    }

    public double getBasicIncome() {
        return basicIncome;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }
}
