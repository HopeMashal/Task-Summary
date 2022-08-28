package task;

public class Circle implements Area {

  private double Radius;

  public Circle(double radius) {
    Radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI*Math.pow(Radius, 2);
  }

  public double getRadius() {
    return Radius;
  }

  public void setRadius(double radius) {
    Radius = radius;
  }
  
}
