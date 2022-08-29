package task;

import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AppJUnitTest {

  @Parameterized.Parameter(0)
  public String AngleDeg;
  @Parameterized.Parameter(1) 
  public String BaseA;
  @Parameterized.Parameter(2)
  public String BaseB;
  @Parameterized.Parameter(3)
  public String Height;
  @Parameterized.Parameter(4)
  public String RadiusA;
  @Parameterized.Parameter(5)
  public String RadiusB;

  @Parameters
	public static Collection<String[]> input() throws Exception{
		String path = "./src/files/ParamTask.csv";
    ContentReader contentReader = new ContentReader();
		List<String[]> lines = contentReader.readAllLines(path);
    lines.remove(0);
		return lines;
	}

  @Test
	@Parameters
	public void getCircleArea() {
    double radiusA = Double.parseDouble(RadiusA);
    Circle circle1 = new Circle(radiusA);
    double ExArea=circle1.getArea();
    double AcArea=Math.PI*Math.pow(radiusA, 2);
    Assert.assertEquals("LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
	}

  @Test
	@Parameters
	public void getEllipseArea() {
    double radiusA = Double.parseDouble(RadiusA);
    double radiusB = Double.parseDouble(RadiusB);
    Ellipse ellipse1 = new Ellipse(radiusA, radiusB);
    double ExArea=ellipse1.getArea();
    double AcArea=radiusA*radiusB*Math.PI;
    Assert.assertEquals("LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
	}

  @Test
	@Parameters
	public void getParallelogramArea() {
    double baseA = Double.parseDouble(BaseA);
    double height = Double.parseDouble(Height);
    Parallelogram parallelogram1 = new Parallelogram(baseA, height);
    double ExArea=parallelogram1.getArea();
    double AcArea=baseA*height;
    Assert.assertEquals("LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
	}

  @Test
	@Parameters
	public void getRectangleArea() {
    double baseA = Double.parseDouble(BaseA);
    double height = Double.parseDouble(Height);
    Rectangle rectangle1 = new Rectangle(baseA, height);
    double ExArea=rectangle1.getArea();
    double AcArea=baseA*height;
    Assert.assertEquals("LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
	}

  @Test
	@Parameters
	public void getSectorArea() {
    double radiusA = Double.parseDouble(RadiusA);
    double angleDeg = Double.parseDouble(AngleDeg);
    Sector sector1 = new Sector(angleDeg, radiusA);
    double ExArea=sector1.getArea();
    double AcArea=0.5*(((Math.PI)/180)*angleDeg)*Math.pow(radiusA, 2);
    Assert.assertEquals("LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
	}

  @Test
	@Parameters
	public void getSquareArea() {
    double height = Double.parseDouble(Height);
    Square square1 = new Square(height);
    double ExArea=square1.getArea();
    double AcArea=Math.pow(height, 2);
    Assert.assertEquals("LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
	}

  @Test
	@Parameters
	public void getTrapezoidArea() {
    double baseA = Double.parseDouble(BaseA);
    double baseB = Double.parseDouble(BaseB);
    double height = Double.parseDouble(Height);
    Trapezoid trapezoid1 = new Trapezoid(baseA, baseB, height);
    double ExArea=trapezoid1.getArea();
    double AcArea=(0.5*(baseA+baseB))*height;
    Assert.assertEquals("LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
	}

  @Test
	@Parameters
	public void getTriangleArea() {
    double baseA = Double.parseDouble(BaseA);
    double height = Double.parseDouble(Height);
    Triangle triangle1 = new Triangle(baseA, height);
    double ExArea=triangle1.getArea();
    double AcArea=0.5*baseA*height;
    Assert.assertEquals("LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
	}
  
}
