package task;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
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
    if(RadiusA != 0.00001){
      if(RadiusA==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Circle circle1 = new Circle(RadiusA);
        double ExArea=circle1.getArea();
        double AcArea=Math.PI*Math.pow(RadiusA, 2);
        assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } else {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
	}

	@Test
	public void getEllipseArea() {
    if(RadiusA != 0.00001 && RadiusB != 0.00001){
      if(RadiusA==0 || RadiusB==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Ellipse ellipse1 = new Ellipse(RadiusA, RadiusB);
        double ExArea=ellipse1.getArea();
        double AcArea=RadiusA*RadiusB*Math.PI;
        assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } else {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
	}

	@Test
	public void getParallelogramArea() {
    if(BaseA != 0.00001 && Height != 0.00001){
      if(BaseA==0 || Height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Parallelogram parallelogram1 = new Parallelogram(BaseA, Height);
        double ExArea=parallelogram1.getArea();
        double AcArea=BaseA*Height;
        assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } else {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
	}

	@Test
	public void getRectangleArea() {
    if(BaseA != 0.00001 && Height != 0.00001){
      if(BaseA==0 || Height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Rectangle rectangle1 = new Rectangle(BaseA, Height);
        double ExArea=rectangle1.getArea();
        double AcArea=BaseA*Height;
        assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } else {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
	}

	@Test
	public void getSectorArea() {
    if(AngleDeg != 0.00001 && RadiusA != 0.00001){
      if(RadiusA==0 || AngleDeg==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS & ANGLES MUST BE POSITIVE NUMBERS");
      }
      else {
        Sector sector1 = new Sector(AngleDeg, RadiusA);
        double ExArea=sector1.getArea();
        double AcArea=0.5*(((Math.PI)/180)*AngleDeg)*Math.pow(RadiusA, 2);
        assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS & ANGLES MUST BE POSITIVE NUMBERS"); 
      }
    } else {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS & ANGLES MUST BE POSITIVE NUMBERS");
    }
	}

  @Test
	public void getSquareArea() {
    if(Height != 0.00001){
      if(Height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else { 
        Square square1 = new Square(Height);
        double ExArea=square1.getArea();
        double AcArea=Math.pow(Height, 2);
        assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } else {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
	}

  @Test
	public void getTrapezoidArea() {
    if(BaseA != 0.00001 && BaseB != 0.00001 && Height != 0.00001){
      if(BaseA==0 || BaseB==0 || Height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Trapezoid trapezoid1 = new Trapezoid(BaseA, BaseB, Height);
        double ExArea=trapezoid1.getArea();
        double AcArea=(0.5*(BaseA+BaseB))*Height;
        assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } else {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
	}

  @Test
	public void getTriangleArea() {
    if(BaseA != 0.00001 && Height != 0.00001){
      if(BaseA==0 || Height==0) {
        Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
      else {
        Triangle triangle1 = new Triangle(BaseA, Height);
        double ExArea=triangle1.getArea();
        double AcArea=0.5*BaseA*Height;
        assertEquals(AcArea, ExArea, "CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS");
      }
    } else {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    }
	}
}
