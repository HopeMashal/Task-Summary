package task;

public class Circle implements Area {

  private double Radius;

  public Circle(double radius) {
    Radius = radius;
  }

  @Override
  public double getArea() {
    if (Radius > 0) return Math.PI*Math.pow(Radius, 2);
    else return 0;
  }

  public double getRadius() {
    return Radius;
  }

  public void setRadius(double radius) {
    Radius = radius;
  }
  
}
