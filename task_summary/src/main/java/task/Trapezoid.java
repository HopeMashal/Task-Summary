package task;

public class Trapezoid implements Area {

  private double BaseA, BaseB, Height;

  public Trapezoid(double baseA, double baseB, double height) {
    BaseA = baseA;
    BaseB = baseB;
    Height = height;
  }

  @Override
  public double getArea() {
    if(BaseA > 0 && BaseB > 0 && Height > 0) return (0.5*(BaseA+BaseB))*Height;
    else return 0;
  }

  public double getBaseA() {
    return BaseA;
  }

  public void setBaseA(double baseA) {
    BaseA = baseA;
  }

  public double getBaseB() {
    return BaseB;
  }

  public void setBaseB(double baseB) {
    BaseB = baseB;
  }

  public double getHeight() {
    return Height;
  }

  public void setHeight(double height) {
    Height = height;
  }
  
}
