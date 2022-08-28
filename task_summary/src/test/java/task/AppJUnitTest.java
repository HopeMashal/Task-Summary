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
    int radiusA = Integer.parseInt(RadiusA);
    Circle circle1 = new Circle(radiusA);
    double ExArea=circle1.getArea();
    double AcArea=Math.PI*Math.pow(radiusA, 2);
    Assert.assertEquals((int)ExArea, (int)AcArea);
	}

  @Test
	@Parameters
	public void getEllipseArea() {
    int radiusA = Integer.parseInt(RadiusA);
    int radiusB = Integer.parseInt(RadiusB);
    Ellipse ellipse1 = new Ellipse(radiusA, radiusB);
    double ExArea=ellipse1.getArea();
    double AcArea=radiusA*radiusB*Math.PI;
    Assert.assertEquals((int)ExArea, (int)AcArea);
	}

  @Test
	@Parameters
	public void getParallelogramArea() {
    int baseA = Integer.parseInt(BaseA);
    int height = Integer.parseInt(Height);
    Parallelogram parallelogram1 = new Parallelogram(baseA, height);
    double ExArea=parallelogram1.getArea();
    double AcArea=baseA*height;
    Assert.assertEquals((int)ExArea, (int)AcArea);
	}

  @Test
	@Parameters
	public void getRectangleArea() {
    int baseA = Integer.parseInt(BaseA);
    int height = Integer.parseInt(Height);
    Rectangle rectangle1 = new Rectangle(baseA, height);
    double ExArea=rectangle1.getArea();
    double AcArea=baseA*height;
    Assert.assertEquals((int)ExArea, (int)AcArea);
	}

  @Test
	@Parameters
	public void getSectorArea() {
    int radiusA = Integer.parseInt(RadiusA);
    int angleDeg = Integer.parseInt(AngleDeg);
    Sector sector1 = new Sector(angleDeg, radiusA);
    double ExArea=sector1.getArea();
    double AcArea=0.5*(((Math.PI)/180)*angleDeg)*Math.pow(radiusA, 2);
    Assert.assertEquals((int)ExArea, (int)AcArea);
	}

  @Test
	@Parameters
	public void getSquareArea() {
    int height = Integer.parseInt(Height);
    Square square1 = new Square(height);
    double ExArea=square1.getArea();
    double AcArea=Math.pow(height, 2);
    Assert.assertEquals((int)ExArea, (int)AcArea);
	}

  @Test
	@Parameters
	public void getTrapezoidArea() {
    int baseA = Integer.parseInt(BaseA);
    int baseB = Integer.parseInt(BaseB);
    int height = Integer.parseInt(Height);
    Trapezoid trapezoid1 = new Trapezoid(baseA, baseB, height);
    double ExArea=trapezoid1.getArea();
    double AcArea=(0.5*(baseA+baseB))*height;
    Assert.assertEquals((int)ExArea, (int)AcArea);
	}

  @Test
	@Parameters
	public void getTriangleArea() {
    int baseA = Integer.parseInt(BaseA);
    int height = Integer.parseInt(Height);
    Triangle triangle1 = new Triangle(baseA, height);
    double ExArea=triangle1.getArea();
    double AcArea=0.5*baseA*height;
    Assert.assertEquals((int)ExArea, (int)AcArea);
	}
  
}
