package task;

import java.util.ArrayList;

import org.junit.Assert;

public class JUnitFunctions {
  public static void getArea(String[] args,String Shape){
    ArrayList<Double> argsList = new ArrayList<Double>();
    Boolean hasString = false;
    for(int i=0;i<args.length;i++){
      try {
        argsList.add(Double.parseDouble(args[i]));
      } catch (Exception e) {
        hasString = true;
      }
    }
    if(argsList.contains(0.0)){
      Assert.fail("CAN'T ENTER ZERO!!! LENGTHS MUST BE POSITIVE NUMBERS");
    } else if (hasString) {
      Assert.fail("CAN'T ENTER STRING!!! LENGTHS MUST BE POSITIVE NUMBERS");
    } else {
      double ExArea=0.0 ,AcArea=0.0;
      if(Shape=="Circle"){
        double radius = argsList.get(0);
        Circle circle1 = new Circle(radius);
        ExArea=circle1.getArea();
        AcArea=Math.PI*Math.pow(radius, 2);
      } else if(Shape=="Ellipse") {
        double radiusA = argsList.get(0);
        double radiusB = argsList.get(1);
        Ellipse ellipse1 = new Ellipse(radiusA, radiusB);
        ExArea=ellipse1.getArea();
        AcArea=radiusA*radiusB*Math.PI;
      } else if(Shape=="Parallelogram") {
        double base = argsList.get(0);
        double height = argsList.get(1);
        Parallelogram parallelogram1 = new Parallelogram(base, height);
        ExArea=parallelogram1.getArea();
        AcArea=base*height;
      } else if(Shape=="Rectangle") {
        double width = argsList.get(0);
        double height = argsList.get(1);
        Rectangle rectangle1 = new Rectangle(width, height);
        ExArea=rectangle1.getArea();
        AcArea=width*height;
      } else if(Shape=="Sector") {
        double radius = argsList.get(0);
        double angleDeg = argsList.get(1);
        Sector sector1 = new Sector(angleDeg, radius);
        ExArea=sector1.getArea();
        AcArea=0.5*(((Math.PI)/180)*angleDeg)*Math.pow(radius, 2);
      } else if(Shape=="Square") {
        double length = argsList.get(0);
        Square square1 = new Square(length);
        ExArea=square1.getArea();
        AcArea=Math.pow(length, 2);
      } else if(Shape=="Trapezoid") {
        double baseA = argsList.get(0);
        double baseB = argsList.get(1);
        double height = argsList.get(2);
        Trapezoid trapezoid1 = new Trapezoid(baseA, baseB, height);
        ExArea=trapezoid1.getArea();
        AcArea=(0.5*(baseA+baseB))*height;
      } else if(Shape=="Triangle") {
        double base = argsList.get(0);
        double height = argsList.get(1);
        Triangle triangle1 = new Triangle(base, height);
        ExArea=triangle1.getArea();
        AcArea=0.5*base*height;
      }
      Assert.assertEquals("CAN'T ENTER NEGATIVE NUMBERS!!! LENGTHS MUST BE POSITIVE NUMBERS",ExArea, AcArea,0);
    }
  }
}
