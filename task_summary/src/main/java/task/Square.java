package task;

public class Square implements Area {

  private double Length;

  public Square(double length) {
    Length = length;
  }

  @Override
  public double getArea() {
    return Math.pow(Length, 2);
  }

  public double getLength() {
    return Length;
  }

  public void setLength(double length) {
    Length = length;
  }
  
}
