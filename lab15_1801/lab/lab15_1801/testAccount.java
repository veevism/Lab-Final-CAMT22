package lab.lab15_1801;

public class testAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("642115045", 10000, 0.1, "01/17/2022");
        SavingsAccount acc2 = new SavingsAccount("642115045", 20000, 0.3, "02/30/2021");
        CheckingAccount acc3 = new CheckingAccount("642115045", 30000, 0.4, "07/21/2023", 1);
        System.out.println("acc1");
        System.out.println(acc1.toString());
        acc1.withdraw(300);
        System.out.println(acc1.toString());
        acc1.deposit(600);
        System.out.println(acc1.toString());
        System.out.println("acc2");
        System.out.println(acc2.toString());
        acc1.withdraw(2500);
        System.out.println(acc2.toString());
        System.out.println("acc3");
        System.out.println(acc3.toString());
        acc3.withdraw(200);
        System.out.println(acc3.toString());
        acc3.withdraw(300);
        System.out.println(acc3.toString());
    }
}
