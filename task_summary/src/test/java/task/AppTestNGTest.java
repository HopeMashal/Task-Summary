package task;

import static task.TestNGFunctions.getArea;

import java.lang.reflect.Method;
import java.util.List;

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
  public static Object[][] input(Method m) throws Exception{
    ContentReader contentReader = new ContentReader();
    List<String[]> lines = contentReader.readAllLines(AppTestNGTest.CSVpath);
    lines.remove(0);
    Object[][] data = new Object[lines.size()][lines.get(0).length];
    int index = 0;
    for(String[] line: lines){
        data[index] = line;
        index++;
    }
    Object[][] CircleData = new Object[lines.size()][1];
    for(int i=0; i < data.length; i++){
      CircleData[i][0] = data[i][4];
    }
    Object[][] EllipseData = new Object[lines.size()][2];
    for(int i=0; i < data.length; i++){
      EllipseData[i][0] = data[i][4];
      EllipseData[i][1] = data[i][5];
    }
    Object[][] ParaRectTriData = new Object[lines.size()][2];
    for(int i=0; i < data.length; i++){
      ParaRectTriData[i][0] = data[i][1];
      ParaRectTriData[i][1] = data[i][3];
    }
    Object[][] SectorData = new Object[lines.size()][2];
    for(int i=0; i < data.length; i++){
      SectorData[i][0] = data[i][0];
      SectorData[i][1] = data[i][4];
    }
    Object[][] SquareData = new Object[lines.size()][1];
    for(int i=0; i < data.length; i++){
      SquareData[i][0] = data[i][3];
    }
    Object[][] TrapezoidData = new Object[lines.size()][3];
    for(int i=0; i < data.length; i++){
      TrapezoidData[i][0] = data[i][1];
      TrapezoidData[i][1] = data[i][2];
      TrapezoidData[i][2] = data[i][3];
    }
    switch (m.getName()) {
      case "getCircleArea": 
        return CircleData;
      case "getEllipseArea": 
        return EllipseData;
      case "getParallelogramArea": 
      case "getRectangleArea":
      case "getTriangleArea": 
        return ParaRectTriData; 
      case "getSectorArea": 
        return SectorData;
      case "getSquareArea": 
        return SquareData;
      case "getTrapezoidArea": 
        return TrapezoidData;
      }
    return null;
  }

  @Test(dataProvider = "input")
  public void getCircleArea(String RadiusA){
    getArea(new String[] {RadiusA}, "Circle");
  }

  @Test(dataProvider = "input")
  public void getEllipseArea(String RadiusA,String RadiusB){
    getArea(new String[] {RadiusA,RadiusB}, "Ellipse");
  }

  @Test(dataProvider = "input")
  public void getParallelogramArea(String BaseA,String Height){
    getArea(new String[] {BaseA,Height}, "Parallelogram");
  }

  @Test(dataProvider = "input")
  public void getRectangleArea(String BaseA,String Height){
    getArea(new String[] {BaseA,Height}, "Rectangle");
  }

  @Test(dataProvider = "input")
  public void getSectorArea(String AngleDeg,String RadiusA){
    getArea(new String[] {RadiusA,AngleDeg}, "Sector");
  }

  @Test(dataProvider = "input")
  public void getSquareArea(String Height){
    getArea(new String[] {Height}, "Square");
  }

  @Test(dataProvider = "input")
  public void getTrapezoidArea(String BaseA,String BaseB,String Height){
    getArea(new String[] {BaseA,BaseB,Height}, "Trapezoid");
  }

  @Test(dataProvider = "input")
  public void getTriangleArea(String BaseA,String Height){
    getArea(new String[] {BaseA,Height}, "Triangle");
  }
}
