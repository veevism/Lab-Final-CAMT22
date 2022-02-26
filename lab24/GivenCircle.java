public class GivenCircle extends GeometricObject implements Comparable {
  private double radius;

  public GivenCircle() {
  }

  public GivenCircle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
  }

  @Override
  public boolean isEqual(Object x) {
    return this.radius == ((GivenCircle) (x)).getRadius();
  }

  @Override
  public int compareTo(Object x) {
    if (this.radius > ((GivenCircle) (x)).getRadius())
      return 1;
    if (this.radius < ((GivenCircle) (x)).getRadius())
      return -1;

    return 0;

  }
}
