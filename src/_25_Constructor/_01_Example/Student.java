package _25_Constructor._01_Example;

public class Student {
    // Özellikler (Attributes)
    String name; // Öğrencinin adı
    String surname;  // Öğrencinin soyadı
    int age;          // Öğrencinin yaşı

    // Yaş parametresi olmadan constructor - yaş varsayılan olarak 18 atanır
    public Student(String name, String surname) {
        // Constructor'a geçirilen ad ve soyad parametreleri sınıfın özelliklerine atanır
        this.name = name;
        this.surname = surname;
        this.age = 18; // Yaş için varsayılan değer atanır
    }

    // Yaş parametresi ile constructor
    public Student(String name, String surname, int age) {
        // Constructor'a geçirilen ad, soyad ve yaş parametreleri sınıfın özelliklerine atanır
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Öğrencinin bilgilerini ekrana yazdıran metod
    public void displayInfo() {
        // Öğrencinin adı ekrana yazdırılır
        System.out.println("Ad: " + this.name);
        // Öğrencinin soyadı ekrana yazdırılır
        System.out.println("Soyad: " + this.surname);
        // Öğrencinin yaşı ekrana yazdırılır
        System.out.println("Yaş: " + this.age);
    }
}
