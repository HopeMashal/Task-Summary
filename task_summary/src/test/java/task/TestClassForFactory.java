package task;

import static task.TestNGFunctions.getArea;

import org.testng.annotations.Test;

public class TestClassForFactory {
  private String AngleDeg, BaseA, BaseB, Height, RadiusA, RadiusB;
	
	
	public TestClassForFactory(String angleDeg, String baseA, String baseB, String height, String radiusA, String radiusB) {
		AngleDeg = angleDeg;
		BaseA = baseA;
		BaseB = baseB;
		Height = height;
		RadiusA = radiusA;
		RadiusB = radiusB;
	}

	@Test
	public void getCircleArea() {
    getArea(new String[] {RadiusA}, "Circle");
	}

	@Test
	public void getEllipseArea() {
    getArea(new String[] {RadiusA,RadiusB}, "Ellipse");
	}

	@Test
	public void getParallelogramArea() {
    getArea(new String[] {BaseA,Height}, "Parallelogram");
	}

	@Test
	public void getRectangleArea() {
    getArea(new String[] {BaseA,Height}, "Rectangle");
	}

	@Test
	public void getSectorArea() {
    getArea(new String[] {RadiusA,AngleDeg}, "Sector");
	}

  @Test
	public void getSquareArea() {
    getArea(new String[] {Height}, "Square");
	}

  @Test
	public void getTrapezoidArea() {
    getArea(new String[] {BaseA,BaseB,Height}, "Trapezoid");
	}

  @Test
	public void getTriangleArea() {
    getArea(new String[] {BaseA,Height}, "Triangle");
	}
}
