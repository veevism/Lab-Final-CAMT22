
abstract class GeometricObject {
    private String color = " ";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Date : " + dateCreated + "\nColor: " + color +
                "\nFill: " + filled;
    }

}