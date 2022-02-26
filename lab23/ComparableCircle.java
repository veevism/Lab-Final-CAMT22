
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return (int) (getRadius() - o.getRadius());
    }
}

class testCircle {
    public static void main(String[] args) {
        ComparableCircle circleOne = new ComparableCircle(1);
        ComparableCircle circleTwo = new ComparableCircle(5);
        if (circleOne.compareTo(circleTwo) >= 0) {
            System.out.println("Circle 1 is bigger.");
        } else {
            System.out.println("Circle 2 is bigger.");
        }
    }
}
