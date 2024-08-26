package _31_Interface._03_Example;

public class ShapeManager {
    public static void main(String[] args) {
        IShape rectangle = new Rectangle(5, 3);
        IShape circle = new Circle(4);

        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Çıktı: 15.0
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter()); // Çıktı: 16.0
        System.out.println("Circle Area: " + circle.calculateArea()); // Çıktı: 50.27
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter()); // Çıktı: 25.13
    }
}
