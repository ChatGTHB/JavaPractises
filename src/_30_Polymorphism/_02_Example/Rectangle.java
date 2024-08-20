package _30_Polymorphism._02_Example;

// Rectangle sınıfı, Shape sınıfından miras alır
public class Rectangle extends Shape {

    private double length;
    private double width;

    // Yapıcı metot
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Rectangle sınıfı, calculateArea metodunu özelleştirir (override)
    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Dikdörtgenin alanı: " + area);
    }
}
