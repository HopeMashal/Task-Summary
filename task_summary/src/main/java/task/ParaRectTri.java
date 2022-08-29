package task;

public class ParaRectTri implements Area {

  private double Base,Height;
  
  public ParaRectTri(double base, double height) {
    Base = base;
    Height = height;
  }

  @Override
  public double getArea() {
    if(Base > 0 && Height > 0) return Base*Height;
    else return 0;
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
