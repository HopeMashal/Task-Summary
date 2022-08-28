package task;

public class Parallelogram implements Area {

  private double Base,Height;

  public Parallelogram(double base, double height) {
    Base = base;
    Height = height;
  }

  @Override
  public double getArea() {
    return Base*Height;
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
