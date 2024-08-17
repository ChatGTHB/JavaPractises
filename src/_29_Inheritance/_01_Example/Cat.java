package _29_Inheritance._01_Example;

// Cat sınıfı, Animal sınıfından miras alır
public class Cat extends Animal {

    // Yapıcı metot (constructor), üst sınıftaki yapıcı metodu çağırır
    public Cat(String name, int age) {
        super(name, age); // Üst sınıftaki name ve age özelliklerini başlatır
    }

    // Cat sınıfı, makeSound metodunu özelleştirir (override)
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }
}
