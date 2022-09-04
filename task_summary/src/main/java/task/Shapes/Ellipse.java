package task.Shapes;

public class Ellipse implements Area {

  private double RadiusA, RadiusB;

  public Ellipse(double radiusA, double radiusB) {
    RadiusA = radiusA;
    RadiusB = radiusB;
  }

  @Override
  public double getArea() {
    if (RadiusA > 0 && RadiusB > 0) return RadiusA*RadiusB*Math.PI;
    else return 0;
  }

  public double getRadiusA() {
    return RadiusA;
  }

  public void setRadiusA(double radiusA) {
    RadiusA = radiusA;
  }

  public double getRadiusB() {
    return RadiusB;
  }

  public void setRadiusB(double radiusB) {
    RadiusB = radiusB;
  }
  
}
