package _32_AbstractClass._03_Example;

public class ShapeManager {
    public static void main(String[] args) {
        ShapeBase rectangle = new Rectangle(5, 3);
        ShapeBase circle = new Circle(4);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
