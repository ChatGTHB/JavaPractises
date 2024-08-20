package _30_Polymorphism._02_Example;

// Circle sınıfı, Shape sınıfından miras alır
public class Circle extends Shape {

    private double radius;

    // Yapıcı metot
    public Circle(double radius) {
        this.radius = radius;
    }

    // Circle sınıfı, calculateArea metodunu özelleştirir (override)
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Dairenin alanı: " + area);
    }
}
