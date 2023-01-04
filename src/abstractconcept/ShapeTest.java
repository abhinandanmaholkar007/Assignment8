package abstractconcept;

abstract class Shape
{
    abstract void area();
}
class Circle extends Shape
{
    private double radius=20;
    private double pie=3.14;
    private double area=pie*radius*radius;
    @Override
    void area() {
        System.out.println("Area of circle is "+area);

    }
}
class Square extends Shape
{
private double side1=10;
private double side2=30;
private double area=side1*side2;
    @Override
    void area() {
        System.out.println("Area of Square is "+area);
    }
}
class Cylinder extends Circle
{
    private double pie=3.14;
    private double radius=10;
    private double height=20;
    private double area=pie*radius*radius*height;
    void area()
    {
        System.out.println("Area of Cylinder is "+area);
    }
}
class Rectangle extends Square
{
private double length=10;
private  double breadth=30;
private double area=length*breadth;
    @Override
    void area() {
        System.out.println("Area of Rectangle is "+area);
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.area();
        Shape shape1=new Square();
        shape1.area();
        Circle circle=new Cylinder();
        circle.area();
        Square square=new Rectangle();
        square.area();

    }
}
