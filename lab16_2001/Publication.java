
public class Publication {
    private String publisher;
    private int noPages;
    private double price;
    private String title;

    public Publication(String publisher, int noPages, double price, String title) {
        this.publisher = publisher;
        this.noPages = noPages;
        this.price = price;
        this.title = title;
    }

    public String toString() {
        return "Publisher: " + this.publisher + "\nNo of pages: " + this.noPages + "\nPrice: " + this.price
                + "\nTitle: " + this.title;
    }
}