package task;

import java.lang.reflect.Method;
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
    try {
      double radiusA =  Double.parseDouble(RadiusA);
      if(radiusA==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Circle circle1 = new Circle(radiusA);
        double ExArea=circle1.getArea();
        double AcArea=Math.PI*Math.pow(radiusA, 2);
        Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } catch (Exception e) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
  }

  @Test(dataProvider = "input")
  public void getEllipseArea(String RadiusA,String RadiusB){
    try {
      double radiusA =  Double.parseDouble(RadiusA);
      double radiusB =  Double.parseDouble(RadiusB);
      if(radiusA==0 || radiusB==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Ellipse ellipse1 = new Ellipse(radiusA, radiusB);
        double ExArea=ellipse1.getArea();
        double AcArea=radiusA*radiusB*Math.PI;
        Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS"); 
      }
    } catch (Exception e) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
  }

  @Test(dataProvider = "input")
  public void getParallelogramArea(String BaseA,String Height){
    try {
      double baseA =  Double.parseDouble(BaseA);
      double height =  Double.parseDouble(Height);
      if(baseA==0 || height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Parallelogram parallelogram1 = new Parallelogram(baseA, height);
        double ExArea=parallelogram1.getArea();
        double AcArea=baseA*height;
        Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } catch (Exception e) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
  }

  @Test(dataProvider = "input")
  public void getRectangleArea(String BaseA,String Height){
    try {
      double baseA =  Double.parseDouble(BaseA);
      double height =  Double.parseDouble(Height);
      if(baseA==0 || height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Rectangle rectangle1 = new Rectangle(baseA, height);
        double ExArea=rectangle1.getArea();
        double AcArea=baseA*height;
        Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }      
    } catch (Exception e) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
  }

  @Test(dataProvider = "input")
  public void getSectorArea(String AngleDeg,String RadiusA){
    try {
      double radiusA =  Double.parseDouble(RadiusA);
      double angleDeg =  Double.parseDouble(AngleDeg);
      if(radiusA==0 || angleDeg==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS & ANGLES MUST BE POSITIVE NUMBERS");
      }
      else {
        Sector sector1 = new Sector(angleDeg, radiusA);
        double ExArea=sector1.getArea();
        double AcArea=0.5*(((Math.PI)/180)*angleDeg)*Math.pow(radiusA, 2);
        Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS & ANGLES MUST BE POSITIVE NUMBERS");
      }     
    } catch (Exception e) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS & ANGLES MUST BE POSITIVE NUMBERS");
    }
  }

  @Test(dataProvider = "input")
  public void getSquareArea(String Height){
    try {
      double height =  Double.parseDouble(Height);
      if(height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Square square1 = new Square(height);
        double ExArea=square1.getArea();
        double AcArea=Math.pow(height, 2);
        Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }      
    } catch (Exception e) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
  }

  @Test(dataProvider = "input")
  public void getTrapezoidArea(String BaseA,String BaseB,String Height){
    try {
      double baseA =  Double.parseDouble(BaseA);
      double baseB =  Double.parseDouble(BaseB);
      double height =  Double.parseDouble(Height);
      if(baseA==0 || baseB==0 || height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Trapezoid trapezoid1 = new Trapezoid(baseA, baseB, height);
        double ExArea=trapezoid1.getArea();
        double AcArea=(0.5*(baseA+baseB))*height;
        Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");  
      }   
    } catch (Exception e) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
  }

  @Test(dataProvider = "input")
  public void getTriangleArea(String BaseA,String Height){
    try {
      double baseA =  Double.parseDouble(BaseA);
      double height =  Double.parseDouble(Height);
      if(baseA==0 || height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Triangle triangle1 = new Triangle(baseA, height);
        double ExArea=triangle1.getArea();
        double AcArea=0.5*baseA*height;
        Assert.assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");  
      }   
    } catch (Exception e) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
  }
}
