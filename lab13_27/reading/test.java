package lab.lab13_27.reading;

public class test {
    public static void main(String[] args) {
        Book readingmat1 = new Book(100, "Steve", 500);
        System.out.println(readingmat1.toString());

        Novel readingmat2 = new Novel(200, "Mr.stone", 500);
        System.out.println(readingmat2.toString());

        Magazine readingmat3 = new Magazine(300, "Spiderman", 300);
        System.out.println(readingmat3.toString());

        TechnicalJournals readingmat4 = new TechnicalJournals(400, "Bear Grill", 400);
        System.out.println(readingmat4.toString());

        Textbook readingmat5 = new Textbook(500, "AJ Prompong", 100);
        System.out.println(readingmat5.toString());

        System.out.println();

    }
}
