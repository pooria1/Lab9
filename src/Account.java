public class Account {
    private AbstractEmployee employee;
    private int cash;

    public Account(AbstractEmployee employee) {
        this.employee = employee;
        this.cash = 0;
    }

    public AbstractEmployee getEmployee() {
        return employee;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
