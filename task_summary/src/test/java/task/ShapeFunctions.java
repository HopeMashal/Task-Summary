package task;

import task.Shapes.Circle;
import task.Shapes.Ellipse;
import task.Shapes.Parallelogram;
import task.Shapes.Rectangle;
import task.Shapes.Sector;
import task.Shapes.Square;
import task.Shapes.Trapezoid;
import task.Shapes.Triangle;

import java.util.ArrayList;

import static task.JUnitAssert.*;
import static task.TestNGAssert.*;

public class ShapeFunctions {
  public static void getArea(String[] args,String Shape,String Testing){
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
      if(Testing=="JUnit") JUnitZeroMsg();
      else if (Testing=="TestNG") TestNGZeroMsg();
    } else if (hasString) {
      if(Testing=="JUnit") JUnitStringMsg();
      else if (Testing=="TestNG") TestNGStringMsg();
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
      if(Testing=="JUnit") JUnitNegativeMsg(ExArea, AcArea);
      else if (Testing=="TestNG") TestNGNegativeMsg(ExArea, AcArea);
    }
  }
}
