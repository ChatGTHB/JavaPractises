package _30_Polymorphism._05_Example;

// Motorcycle sınıfı, Vehicle sınıfından miras alır
public class Motorcycle extends Vehicle {

    // Motorcycle sınıfı, startEngine metodunu özelleştirir (override)
    @Override
    public void startEngine() {
        System.out.println("Motosiklet motoru çalışıyor: Braap Braap!");
    }
}
