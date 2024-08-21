package _30_Polymorphism._05_Example;

// Üst sınıf: Vehicle
public class Vehicle {

    // Motor çalıştırma metodu (alt sınıflar özelleştirebilir)
    public void startEngine() {
        System.out.println("Araç motoru çalışıyor.");
    }

    // Motor durdurma metodu
    public void stopEngine() {
        System.out.println("Araç motoru durduruluyor.");
    }
}
