package _30_Polymorphism._05_Example;

public class VehicleSimulation {
    public static void main(String[] args) {
        // Polymorphism ile üst sınıf referansı kullanarak alt sınıf nesneleri oluşturma
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Motor çalışma davranışları
        car.startEngine();  // Araba motoru çalışıyor: Vroom Vroom!
        motorcycle.startEngine();  // Motosiklet motoru çalışıyor: Braap Braap!
    }
}
