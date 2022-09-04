package task.Shapes;

public class Square implements Area {

  private double Length;

  public Square(double length) {
    Length = length;
  }

  @Override
  public double getArea() {
    if(Length > 0) return Math.pow(Length, 2);
    else return 0;
  }

  public double getLength() {
    return Length;
  }

  public void setLength(double length) {
    Length = length;
  }
  
}
