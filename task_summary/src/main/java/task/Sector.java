package task;

public class Sector implements Area {

  private double Angle, Radius;

  public Sector(double angle, double radius) {
    Angle = angle;
    Radius = radius;
  }

  @Override
  public double getArea() {
    if (Angle > 0 && Radius > 0){
      Angle = ((Math.PI)/180)*Angle;
      return 0.5*Angle*Math.pow(Radius, 2);
    } else return 0;
  }

  public double getAngle() {
    return Angle;
  }

  public void setAngle(double angle) {
    Angle = angle;
  }

  public double getRadius() {
    return Radius;
  }

  public void setRadius(double radius) {
    Radius = radius;
  }
  
}
