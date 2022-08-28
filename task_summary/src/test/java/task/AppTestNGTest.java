package task;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTestNGTest {
  
  static String CSVpath;

  @Parameters({"CSVpath"})
  @BeforeSuite
  public void beforeSuite(String CSVpath){
    AppTestNGTest.CSVpath = CSVpath;
  }

  @DataProvider
  public static Object[][] input() throws Exception{
    ContentReader contentReader = new ContentReader();
    List<String[]> lines = contentReader.readAllLines(AppTestNGTest.CSVpath);
    lines.remove(0);
    Object[][] data = new Object[lines.size()][lines.get(0).length];
    int index = 0;
    for(String[] line: lines){
        data[index] = line;
        index++;
    }
    return data;
  }

  @Test(dataProvider = "input")
  public void getCircleArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int radiusA = Integer.parseInt(RadiusA);
    Circle circle1 = new Circle(radiusA);
    double ExArea=circle1.getArea();
    double AcArea=Math.PI*Math.pow(radiusA, 2);
    Assert.assertEquals(ExArea, AcArea);
  }

  @Test(dataProvider = "input")
  public void getEllipseArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int radiusA = Integer.parseInt(RadiusA);
    int radiusB = Integer.parseInt(RadiusB);
    Ellipse ellipse1 = new Ellipse(radiusA, radiusB);
    double ExArea=ellipse1.getArea();
    double AcArea=radiusA*radiusB*Math.PI;
    Assert.assertEquals(ExArea, AcArea);
  }

  @Test(dataProvider = "input")
  public void getParallelogramArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int baseA = Integer.parseInt(BaseA);
    int height = Integer.parseInt(Height);
    Parallelogram parallelogram1 = new Parallelogram(baseA, height);
    double ExArea=parallelogram1.getArea();
    double AcArea=baseA*height;
    Assert.assertEquals(ExArea, AcArea);
  }

  @Test(dataProvider = "input")
  public void getRectangleArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int baseA = Integer.parseInt(BaseA);
    int height = Integer.parseInt(Height);
    Rectangle rectangle1 = new Rectangle(baseA, height);
    double ExArea=rectangle1.getArea();
    double AcArea=baseA*height;
    Assert.assertEquals(ExArea, AcArea);
  }

  @Test(dataProvider = "input")
  public void getSectorArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int radiusA = Integer.parseInt(RadiusA);
    int angleDeg = Integer.parseInt(AngleDeg);
    Sector sector1 = new Sector(angleDeg, radiusA);
    double ExArea=sector1.getArea();
    double AcArea=0.5*(((Math.PI)/180)*angleDeg)*Math.pow(radiusA, 2);
    Assert.assertEquals(ExArea, AcArea);
  }

  @Test(dataProvider = "input")
  public void getSquareArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int height = Integer.parseInt(Height);
    Square square1 = new Square(height);
    double ExArea=square1.getArea();
    double AcArea=Math.pow(height, 2);
    Assert.assertEquals(ExArea, AcArea);
  }

  @Test(dataProvider = "input")
  public void getTrapezoidArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int baseA = Integer.parseInt(BaseA);
    int baseB = Integer.parseInt(BaseB);
    int height = Integer.parseInt(Height);
    Trapezoid trapezoid1 = new Trapezoid(baseA, baseB, height);
    double ExArea=trapezoid1.getArea();
    double AcArea=(0.5*(baseA+baseB))*height;
    Assert.assertEquals(ExArea, AcArea);
  }

  @Test(dataProvider = "input")
  public void getTriangleArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int baseA = Integer.parseInt(BaseA);
    int height = Integer.parseInt(Height);
    Triangle triangle1 = new Triangle(baseA, height);
    double ExArea=triangle1.getArea();
    double AcArea=0.5*baseA*height;
    Assert.assertEquals(ExArea, AcArea);
  }
}
