
import java.util.ArrayList;

interface Colorable {
    public void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        setSide(0);
    }

    public Square(double side) {
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}

class testSquare {
    public static void main(String[] args) {
        ArrayList<Square> sqList = new ArrayList<Square>();
        sqList.add(new Square(1));
        sqList.add(new Square(2));
        sqList.add(new Square(3));
        sqList.add(new Square(4));
        sqList.add(new Square(5));
        for (int i = 0; i < sqList.size(); i++) {
            System.out.println(i + " Area: " + sqList.get(i).getArea());
            System.out.print(i + " ");
            sqList.get(i).howToColor();
        }
    }
}
