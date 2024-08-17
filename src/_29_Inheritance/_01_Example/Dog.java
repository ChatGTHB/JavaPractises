package _29_Inheritance._01_Example;

// Dog sınıfı, Animal sınıfından miras alır
public class Dog extends Animal {

    // Yapıcı metot (constructor), üst sınıftaki yapıcı metodu çağırır
    public Dog(String name, int age) {
        super(name, age); // Üst sınıftaki name ve age özelliklerini başlatır
    }

    // Dog sınıfı, makeSound metodunu özelleştirir (override)
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}
