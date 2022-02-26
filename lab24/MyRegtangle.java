public class MyRegtangle {
    public static void main(String[] args) {
        GivenRectangle r1 = new GivenRectangle(6, 4);
        GivenRectangle r2 = new GivenRectangle(6, 6);

        System.out.println(r1.isEqual(r2));
        System.out.println(r1.compareTo(r2));

    }
}
