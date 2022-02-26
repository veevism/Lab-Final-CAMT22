package lab17_2401;

import java.util.ArrayList;

public class Account {
    private int accID;
    private double balance;
    private String name;
    private double annualRate;
    private java.util.Date dateCreated;
    public ArrayList<Transaction> Transactions;

    public Account() {
        this.name = "Unknow";
        this.accID = 642115045;
        this.balance = 0;
        this.annualRate = 0.1;
        this.dateCreated = new java.util.Date();
        this.Transactions = new ArrayList<Transaction>();
    }

    public Account(String name, int accID, double balance) {
        this.name = name;
        this.balance = balance;
        this.accID = accID;
        this.annualRate = 0.1;
        this.dateCreated = new java.util.Date();
        this.Transactions = new ArrayList<Transaction>();
    }

    public Account(String name, int accID, double balance, double annualRate) {
        this.name = name;
        this.accID = accID;
        this.balance = balance;
        this.annualRate = annualRate;
        this.dateCreated = new java.util.Date();
        this.Transactions = new ArrayList<Transaction>();
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public void deposit(double money) {
        balance += money;

        Transactions.add(new Transaction('D', money, this.balance, "Deposit", this.dateCreated));
    }

    public void withdraw(double money) {
        balance -= money;

        Transactions.add(new Transaction('W', money, this.balance, "Withdraw", this.dateCreated));
    }

    public String toString() {
        return "Name : " + this.name + "\nAccount : " + accID + "\nBalance: " + balance + "\nAnnual Interest Rate: "
                + annualRate
                + "\nDate Created: " + dateCreated;

    }

    public void printallTransaction() {
        for (int i = 0; i < Transactions.size(); i++) {
            System.out.println(Transactions.get(i).printTransaction());
        }
    }

}
