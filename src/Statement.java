public class Statement {
    private double amount;
    private AbstractEmployee reciever;

    public Statement(double amount, AbstractEmployee reciever) {
        this.amount = amount;
        this.reciever = reciever;
    }

    public double getAmount() {
        return amount;
    }

    public AbstractEmployee getReciever() {
        return reciever;
    }
}
