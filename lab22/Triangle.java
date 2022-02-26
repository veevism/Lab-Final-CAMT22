
public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = 1 / 4.0 * Math.sqrt(
                (side1 + side2 + side3) * (side1 + side2 - side3) * (side1 + side3 - side2) * (side2 + side3 - side1));
        return s;
    }

    @Override
    public String toString() {
        return " Triangle: \nSide 1 = " + side1 + "\nSide 2 = " + side2
                + "\nSide 3 = " + side3;
    }
}