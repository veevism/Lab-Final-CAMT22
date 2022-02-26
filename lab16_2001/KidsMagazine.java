
public class KidsMagazine extends Magazine {
    private String ageRange;

    public KidsMagazine(String publisher, int noPages, double price, String title, String pub, String age) {
        super(publisher, noPages, price, title, pub);
        this.ageRange = age;
    }

    public String toString() {
        return super.toString() + "\nAge Range: " + ageRange;
    }
}