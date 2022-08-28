package task;

public class App 
{
    public static void main( String[] args )
    {
        Circle circle1 = new Circle(5);
        System.out.println("\nCircle Area: " + circle1.getArea());

        Ellipse ellipse1 = new Ellipse(2, 3);
        System.out.println("\nEllipse Area: " + ellipse1.getArea());

        Parallelogram parallelogram1 = new Parallelogram(3, 4);
        System.out.println("\nParallelogram Area: " + parallelogram1.getArea());

        Rectangle rectangle1 = new Rectangle(4, 7);
        System.out.println("\nRectangle Area: " + rectangle1.getArea());

        Sector sector1 = new Sector(45, 4);
        System.out.println("\nSector Area: " + sector1.getArea());

        Square square1 = new Square(4);
        System.out.println("\nSquare Area: " + square1.getArea());

        Trapezoid trapezoid1 = new Trapezoid(3, 4, 2);
        System.out.println("\nTrapezoid Area: " + trapezoid1.getArea());

        Triangle triangle1 = new Triangle(3, 4);
        System.out.println("\nTriangle Area: " + triangle1.getArea());
    }
}
