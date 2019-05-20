import java.util.ArrayList;

public class AccountingManegment {
    ArrayList<Account> accounts;
    ArrayList<Statement> statements;

    public AccountingManegment() {
        this.accounts = new ArrayList<>();
        this.statements = new ArrayList<>();
    }

    public void checkout(AccountingInterface employee) {
        boolean flag = true;
        for (Account account : accounts) {
            if (account.getEmployee().equals(employee)) {
                double amount = employee.callCurrentIncome();
                account.setCash(account.getCash() + (int)amount);
                flag = false;
                Statement statement = new Statement(amount, employee.callEmployee());
                statements.add(statement);
            }
        }
        if (flag) {
            double amount = employee.callCurrentIncome();
            Account account = new Account(employee.callEmployee());
            account.setCash((int)employee.callCurrentIncome());
            accounts.add(account);
            Statement statement = new Statement(amount, employee.callEmployee());
            statements.add(statement);
        }
    }
}
