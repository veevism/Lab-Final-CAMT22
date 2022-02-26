public class GivenRectangle extends GeometricObject implements Comparable {
  private double width;
  private double height;

  public GivenRectangle() {
  }

  public GivenRectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }

  @Override
  public boolean isEqual(Object x) {
    return this.getArea() == ((GivenRectangle) (x)).getArea();
  }

  @Override
  public int compareTo(Object x) {
    if (this.getArea() > ((GivenRectangle) (x)).getArea())
      return 1;
    if (this.getArea() < ((GivenRectangle) (x)).getArea())
      return -1;

    return 0;

  }

}
