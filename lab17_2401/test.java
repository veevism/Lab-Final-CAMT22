package lab17_2401;

public class test {
    public static void main(String[] args) {
        Account person1 = new Account("Georgie", 1122, 1000, 1.5);

        person1.deposit(30);
        person1.deposit(40);
        person1.deposit(50);

        person1.withdraw(5);
        person1.withdraw(4);
        person1.withdraw(2);

        System.out.println(person1.toString());
        person1.printallTransaction();
    }
}
