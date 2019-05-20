public class ServiceEmployee extends AbstractEmployee{
    public ServiceEmployee(String firstName, String lastName, String ID, int joiningYear, Department department, String position, double basicIncome) {
        super(firstName, lastName, ID, joiningYear, department, position, basicIncome);
    }
    public boolean isPromotable() {
        return true;
    }

    public boolean calCurrentIncome() {
        return true;
    }

}
