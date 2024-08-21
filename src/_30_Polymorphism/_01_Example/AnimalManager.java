package _30_Polymorphism._01_Example;

public class AnimalManager {
    public static void main(String[] args) {
        // Polymorphism ile üst sınıf referansı kullanarak alt sınıf nesneleri oluşturma
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Ses çıkarma davranışları
        myDog.makeSound();  // Köpek havlıyor.
        myCat.makeSound();  // Kedi miyavlıyor.
    }
}
