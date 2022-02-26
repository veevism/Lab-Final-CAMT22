package lab.lab13_27.reading;

class Book extends readingmat {
    public Book(int np, String pch, int sol) {
        super(np, pch, sol);
    }

    @Override
    public String toString() {
        return super.toString() + " Type : Book";
    }
}

class Novel extends readingmat {
    public Novel(int np, String pch, int sol) {
        super(np, pch, sol);
    }

    @Override
    public String toString() {
        return super.toString() + " Type : Novel";
    }
}

class Magazine extends readingmat {
    public Magazine(int np, String pch, int sol) {
        super(np, pch, sol);
    }

    @Override
    public String toString() {
        return super.toString() + " Type : Magazine";
    }
}

class TechnicalJournals extends readingmat {
    public TechnicalJournals(int np, String pch, int sol) {
        super(np, pch, sol);
    }

    @Override
    public String toString() {
        return super.toString() + " Type : TechnicalJournals";
    }
}

class Textbook extends readingmat {
    public Textbook(int np, String pch, int sol) {
        super(np, pch, sol);
    }

    @Override
    public String toString() {
        return super.toString() + " Type : Textbook";
    }
}
