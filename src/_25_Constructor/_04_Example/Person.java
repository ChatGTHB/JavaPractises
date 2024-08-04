package _25_Constructor._04_Example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    // Özellikler (Attributes)
    private String name;       // Kişinin adı
    private int age;           // Kişinin yaşı
    private List<String> hobbies; // Kişinin hobileri

    // Constructor - Kişi nesnesi oluşturulurken gerekli bilgileri alır ve atar
    public Person(String name, int age, List<String> hobbies) {
        this.name = name; // Kişinin adı atanır
        this.age = age; // Kişinin yaşı atanır
        // Hobiler null değilse atanır, null ise boş bir liste oluşturulur
        this.hobbies = hobbies != null ? hobbies : new ArrayList<>();
    }

    // Kişi bilgilerini ekrana yazdıran metod
    public void displayInfo() {
        // Kişinin adı ekrana yazdırılır
        System.out.println("Ad: " + this.name);
        // Kişinin yaşı ekrana yazdırılır
        System.out.println("Yaş: " + this.age);
        // Kişinin hobileri ekrana yazdırılır, hobiler virgülle ayrılarak birleştirilir
        System.out.println("Hobiler: " + String.join(", ", this.hobbies));
    }
}
