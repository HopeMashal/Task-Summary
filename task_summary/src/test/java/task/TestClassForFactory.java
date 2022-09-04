package task;

import static task.ShapeFunctions.getArea;

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
    getArea(new String[] {RadiusA}, "Circle","TestNG");
	}

	@Test
	public void getEllipseArea() {
    getArea(new String[] {RadiusA,RadiusB}, "Ellipse","TestNG");
	}

	@Test
	public void getParallelogramArea() {
    getArea(new String[] {BaseA,Height}, "Parallelogram","TestNG");
	}

	@Test
	public void getRectangleArea() {
    getArea(new String[] {BaseA,Height}, "Rectangle","TestNG");
	}

	@Test
	public void getSectorArea() {
    getArea(new String[] {RadiusA,AngleDeg}, "Sector","TestNG");
	}

  @Test
	public void getSquareArea() {
    getArea(new String[] {Height}, "Square","TestNG");
	}

  @Test
	public void getTrapezoidArea() {
    getArea(new String[] {BaseA,BaseB,Height}, "Trapezoid","TestNG");
	}

  @Test
	public void getTriangleArea() {
    getArea(new String[] {BaseA,Height}, "Triangle","TestNG");
	}
}
