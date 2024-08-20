package _30_Polymorphism._02_Example;

public class ShapeManager {
    public static void main(String[] args) {
        // Polymorphism ile üst sınıf referansı kullanarak alt sınıf nesneleri oluşturma
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Alan hesaplama davranışları
        circle.calculateArea();  // Dairenin alanı: 78.53981633974483
        rectangle.calculateArea();  // Dikdörtgenin alanı: 24.0
    }
}
