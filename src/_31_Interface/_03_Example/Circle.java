package _31_Interface._03_Example;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Dairenin alanı
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Dairenin çevresi
    }
}
