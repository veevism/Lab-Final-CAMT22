package lab.lab15_1801;

public class Point {
    private double x;
    private double y;

    public Point(double nx, double ny) {
        this.x = nx;
        this.y = ny;
    }

    private double getX() {
        return this.x;
    }

    private double getY() {
        return this.y;
    }

    public boolean equal(Point p2) {
        return this.x == p2.getX() && this.y == p2.getY();
    }

    public void printInfo() {
        System.out.print("(" + getX() + ", " + getY() + ")      ");
    }
}
