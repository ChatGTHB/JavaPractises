package inheritance.example;

// Developer sınıfı, Employee sınıfından miras alır
public class Developer extends Employee {

    // Yapıcı metot (constructor), üst sınıftaki yapıcı metodu çağırır
    public Developer(String name, double salary) {
        super(name, salary); // Üst sınıftaki name ve salary özelliklerini başlatır
    }

    // Developer sınıfı, work metodunu özelleştirir (override)
    @Override
    public void work() {
        System.out.println(name + " kod yazıyor.");
    }
}
