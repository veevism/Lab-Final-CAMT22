
public class TestPublication {
    public static void main(String[] args) {

        Publication pub1 = new Magazine("Phoenix next", 361, 400, "เกิดชาตินี้พี่ต้องเทw", "Monthly");
        System.out.println(pub1.toString() + "\n");

        Publication pub3 = new KidsMagazine("publication in the woods", 4321, 52, "Bitcoin cryptocurrency", "Monthly",
                "30");
        System.out.println(pub3.toString() + "\n");

        Publication pub4 = new Book("Some publication", 1234, 750, "Hi", "Sorawee");
        System.out.println(pub4.toString() + "\n");
    }
}