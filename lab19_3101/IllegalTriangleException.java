package lab19_3101;

public class IllegalTriangleException extends Exception {
    private double perimeter;

    public IllegalTriangleException(String side, double sideval) {
        super(side + " = " + sideval + " is larger than other two");
    }
}
