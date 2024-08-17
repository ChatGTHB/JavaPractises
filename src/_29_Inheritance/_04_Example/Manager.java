package inheritance.example;

// Manager sınıfı, Employee sınıfından miras alır
public class Manager extends Employee {

    // Yapıcı metot (constructor), üst sınıftaki yapıcı metodu çağırır
    public Manager(String name, double salary) {
        super(name, salary); // Üst sınıftaki name ve salary özelliklerini başlatır
    }

    // Manager sınıfı, work metodunu özelleştirir (override)
    @Override
    public void work() {
        System.out.println(name + " bir ekibi yönetiyor.");
    }
}
