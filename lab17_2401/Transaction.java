package lab17_2401;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String decription;
    private java.util.Date dateCreated;

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Transaction(char type, double amount, double balance, String decription, java.util.Date dateCreated) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.decription = decription;
        this.dateCreated = dateCreated;
    }

    public String printTransaction() {
        return "Type : " + this.type + " || Amount : " + this.amount + " || Balance : " + this.balance + " || Date : "
                + this.dateCreated
                + " || Decription : " + this.decription;

    }

}