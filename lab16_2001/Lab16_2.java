
import java.util.ArrayList;
import java.util.Date;

public class Lab16_2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();

        list.add(new Loan("Sorawee", 500));
        list.add(new Date());
        list.add(new Circle(5));
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println();
        }
    }
}

class Loan {
    private String name;
    private double loan;

    public Loan(String name, double loan) {
        this.name = name;
        this.loan = loan;
    }

    public String toString() {
        return "Name : " + this.name + " Loan : " + this.loan;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    public String toString() {
        return "Radius : " + this.radius + " Area is : " + getArea() + " Perimeter is : "
                + getPerimeter();
    }
}