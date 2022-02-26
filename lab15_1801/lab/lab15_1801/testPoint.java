package lab.lab15_1801;

public class testPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.print("Point1 is at ");
        p1.printInfo();

        Point p2 = new Point(1, 3);
        System.out.print("Point2 is at ");
        p2.printInfo();
        System.out.println("");

        if (p1.equal(p2)) {
            System.out.println("Point1 and Point2 are the same.");
        } else {
            System.out.println("Point1 and Point2 are different.");
        }
    }
}
