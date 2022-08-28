package task;

public class Triangle implements Area {

  private double Base, Height;

  public Triangle(double base, double height) {
    Base = base;
    Height = height;
  }

  @Override
  public double getArea() {
    return 0.5*Base*Height;
  }

  public double getBase() {
    return Base;
  }

  public void setBase(double base) {
    Base = base;
  }

  public double getHeight() {
    return Height;
  }

  public void setHeight(double height) {
    Height = height;
  }
  
}
