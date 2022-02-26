
public class Book extends Publication {
    private String author;

    public Book(String publisher, int noPages, double price, String title, String author) {
        super(publisher, noPages, price, title);
        this.author = author;
    }

    public String toString() {
        return super.toString() + "\nAuthor: " + author;
    }
}