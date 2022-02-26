package lab.lab15_1801;

public class Account {
    private String accNum;
    protected int balance;
    private double annualRate;
    private String dateCreated;

    public Account() {
        accNum = "642115045";
        balance = 0;
        annualRate = 0.1;
        dateCreated = "01/17/2022";
    }

    public Account(String accNum, int balance, double annualRate, String dateCreated) {
        this.accNum = accNum;
        this.balance = balance;
        this.annualRate = annualRate;
        this.dateCreated = dateCreated;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        this.balance -= money;
    }

    public String toString() {
        return "Account: " + accNum + " Balance: " + balance + " Annual Interest Rate: " + annualRate
                + " Date Created: " + dateCreated;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String accNum, int balance, double annualRate, String dateCreated) {
        super(accNum, balance, annualRate, dateCreated);

    }

    public void withdraw(int money) {
        if (money <= this.balance) {
            this.balance -= money;
        }
    }
}

class CheckingAccount extends Account {
    private int limit;

    public CheckingAccount() {
        super();
        this.limit = 3;
    }

    public CheckingAccount(String accNum, int balance, double annualRate, String dateCreated, int limit) {
        super(accNum, balance, annualRate, dateCreated);
        this.limit = limit;
    }

    public void withdraw(int money) {
        if (limit > 0) {
            this.balance -= money;
            limit--;
        }
    }

    public String toString() {
        return super.toString() + " Limit: " + limit;
    }
}
