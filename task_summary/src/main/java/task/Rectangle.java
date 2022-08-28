package task;

public class Rectangle implements Area {

  private double Width,Height;
  
  public Rectangle(double width, double height) {
    Width = width;
    Height = height;
  }

  @Override
  public double getArea() {
    if(Width > 0 && Height > 0) return Width*Height;
    else return 0;
  }

  public double getWidth() {
    return Width;
  }

  public void setWidth(double width) {
    Width = width;
  }

  public double getHeight() {
    return Height;
  }

  public void setHeight(double height) {
    Height = height;
  }
  
}
