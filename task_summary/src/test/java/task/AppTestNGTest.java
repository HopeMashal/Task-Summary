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
    Assert.assertEquals((int)ExArea, (int)AcArea);
  }

  @Test(dataProvider = "input")
  public void getEllipseArea(String AngleDeg,String BaseA,String BaseB,String Height,String RadiusA,String RadiusB){
    int radiusA = Integer.parseInt(RadiusA);
    int radiusB = Integer.parseInt(RadiusB);
    Ellipse ellipse1 = new Ellipse(radiusA, radiusB);
    double ExArea=ellipse1.getArea();
    double AcArea=radiusA*radiusB*Math.PI;
    Assert.assertEquals((int)ExArea, (int)AcArea);
  }
}
