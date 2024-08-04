package _25_Constructor._03_Example;

public class Car {
    // Aracın markası, modeli ve üretim yılı için değişkenler tanımlanıyor
    private String make;
    private String model;
    private int year;

    // Constructor: Aracın bilgilerini ayarlamak için kullanılır
    public Car(String make, String model, int year) {
        // Constructor'a geçirilen marka, model ve yıl parametreleri sınıfın özelliklerine atanır
        this.make = make; // Marka bilgisi ayarlanır
        this.model = model; // Model bilgisi ayarlanır
        this.year = year; // Üretim yılı bilgisi ayarlanır
    }

    // Aracın bilgilerini ekrana yazdırmak için displayInfo metodu
    public void displayInfo() {
        System.out.println("Make: " + this.make); // Marka bilgisi yazdırılır
        System.out.println("Model: " + this.model); // Model bilgisi yazdırılır
        System.out.println("Year: " + this.year); // Üretim yılı bilgisi yazdırılır
        System.out.println();
    }

    // toString metodunu override ederek aracın bilgilerini metin olarak döndürme
    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}
