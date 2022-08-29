package task;

public class Triangle extends ParaRectTri {

  public Triangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double getArea() {
    return super.getArea()*0.5;
  }
  
}
