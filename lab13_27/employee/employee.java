package lab.lab13_27.employee;

public class employee {
    private String name;
    private String org;
    private int salary;

    public employee(String nm, String org, int sal) {
        this.name = nm;
        this.org = org;
        this.salary = sal;

    }

    public String getName() {
        return name;
    }

    public String getOrg() {
        return org;
    }

    public int getSalaray() {
        return salary;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public void setSalaray(int sal) {
        this.salary = sal;
    }

    public String toString() {
        return "Hello my name is : " + name + " From : " + org + " My salary : " + salary;
    }
}
