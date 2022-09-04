package task;

import static task.ShapeFunctions.getArea;

import java.util.Collection;
import java.util.List;

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
    getArea(new String[] {RadiusA}, "Circle","JUnit");
	}

  @Test
	@Parameters
	public void getEllipseArea() {
    getArea(new String[] {RadiusA,RadiusB}, "Ellipse","JUnit");
	}

  @Test
	@Parameters
	public void getParallelogramArea() {
    getArea(new String[] {BaseA,Height}, "Parallelogram","JUnit");
	}

  @Test
	@Parameters
	public void getRectangleArea() {
    getArea(new String[] {BaseA,Height}, "Rectangle","JUnit");
	}

  @Test
	@Parameters
	public void getSectorArea() {
    getArea(new String[] {RadiusA,AngleDeg}, "Sector","JUnit");
	}

  @Test
	@Parameters
	public void getSquareArea() {
    getArea(new String[] {Height}, "Square","JUnit");
	}

  @Test
	@Parameters
	public void getTrapezoidArea() {
    getArea(new String[] {BaseA,BaseB,Height}, "Trapezoid","JUnit");
	}

  @Test
	@Parameters
	public void getTriangleArea() {
    getArea(new String[] {BaseA,Height}, "Triangle","JUnit");
	}
}
