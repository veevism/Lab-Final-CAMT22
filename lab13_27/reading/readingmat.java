package lab.lab13_27.reading;

public class readingmat {
    private int numpage;
    private String prichar;
    private int solded;

    public readingmat(int np, String pch, int sol) {
        this.numpage = np;
        this.prichar = pch;
        this.solded = sol;

    }

    public int getNumpage() {
        return numpage;
    }

    public String getPrimaryChar() {
        return prichar;
    }

    public int getSolded() {
        return solded;
    }

    public void setNumpage(int np) {
        this.numpage = np;
    }

    public void setPrimaryChar(String pch) {
        this.prichar = pch;
    }

    public void setSolded(int sol) {
        this.solded = sol;
    }

    public String toString() {
        return " Number of page : " + numpage + " Name of primary character : " + prichar + " Has Solded : " + solded;
    }

}
