package lab.lab12_2312.person;

public class Employee extends Person {
    String office;
    int salary;

    // Person(){}
    public Employee(String n, String add, Long phnum, String email, String ofi, int sla) {
        super(n, add, phnum, email);

        this.office = ofi;
        this.salary = sla;

    }

    @Override
    public String toString() {
        return super.toString() + " || Office : " + office + " || Salary : " + salary;
    }

}
