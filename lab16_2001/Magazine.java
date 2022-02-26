
public class Magazine extends Publication {
    private String pubUnit;

    public Magazine(String publisher, int noOfPages, double price, String title, String pubUnit) {
        super(publisher, noOfPages, price, title);
        this.pubUnit = pubUnit;
    }

    public String toString() {
        return super.toString() + "\nPrinting type: " + pubUnit;
    }
}