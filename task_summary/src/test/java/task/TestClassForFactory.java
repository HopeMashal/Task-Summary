package task;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestClassForFactory {
  private double AngleDeg, BaseA, BaseB, Height, RadiusA, RadiusB;
	
	
	public TestClassForFactory(double angleDeg, double baseA, double baseB, double height, double radiusA,
			double radiusB) {
		AngleDeg = angleDeg;
		BaseA = baseA;
		BaseB = baseB;
		Height = height;
		RadiusA = radiusA;
		RadiusB = radiusB;
	}

	@Test
	public void getCircleArea() {
    Circle circle1 = new Circle(RadiusA);
    double ExArea=circle1.getArea();
    double AcArea=Math.PI*Math.pow(RadiusA, 2);
    assertEquals(AcArea, ExArea, "LENGTHS MUST BE POSITIVE NUMBERS");
	}

	@Test
	public void getEllipseArea() {
    Ellipse ellipse1 = new Ellipse(RadiusA, RadiusB);
    double ExArea=ellipse1.getArea();
    double AcArea=RadiusA*RadiusB*Math.PI;
    assertEquals(AcArea, ExArea, "LENGTHS MUST BE POSITIVE NUMBERS");
	}

	@Test
	public void getParallelogramArea() {
    Parallelogram parallelogram1 = new Parallelogram(BaseA, Height);
    double ExArea=parallelogram1.getArea();
    double AcArea=BaseA*Height;
    assertEquals(AcArea, ExArea, "LENGTHS MUST BE POSITIVE NUMBERS");
	}

	@Test
	public void getRectangleArea() {
    Rectangle rectangle1 = new Rectangle(BaseA, Height);
    double ExArea=rectangle1.getArea();
    double AcArea=BaseA*Height;
    assertEquals(AcArea, ExArea, "LENGTHS MUST BE POSITIVE NUMBERS");
	}

	@Test
	public void getSectorArea() {
    Sector sector1 = new Sector(AngleDeg, RadiusA);
    double ExArea=sector1.getArea();
    double AcArea=0.5*(((Math.PI)/180)*AngleDeg)*Math.pow(RadiusA, 2);
    assertEquals(AcArea, ExArea, "LENGTHS MUST BE POSITIVE NUMBERS");
	}

  @Test
	public void getSquareArea() {
    Square square1 = new Square(Height);
    double ExArea=square1.getArea();
    double AcArea=Math.pow(Height, 2);
    assertEquals(AcArea, ExArea, "LENGTHS MUST BE POSITIVE NUMBERS");
	}

  @Test
	public void getTrapezoidArea() {
    Trapezoid trapezoid1 = new Trapezoid(BaseA, BaseB, Height);
    double ExArea=trapezoid1.getArea();
    double AcArea=(0.5*(BaseA+BaseB))*Height;
    assertEquals(AcArea, ExArea, "LENGTHS MUST BE POSITIVE NUMBERS");
	}

  @Test
	public void getTriangleArea() {
    Triangle triangle1 = new Triangle(BaseA, Height);
    double ExArea=triangle1.getArea();
    double AcArea=0.5*BaseA*Height;
    assertEquals(AcArea, ExArea, "LENGTHS MUST BE POSITIVE NUMBERS");
	}
}