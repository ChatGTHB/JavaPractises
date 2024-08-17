package _29_Inheritance._04_Example;

// Employee sınıfı, tüm çalışanların ortak özelliklerini ve metotlarını temsil eder
public class Employee {

    // Çalışanların ortak özellikleri: isim ve maaş
    protected String name;
    protected double salary;

    // Yapıcı metot (constructor), name ve salary özelliklerini başlatır
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Ortak bir iş yapma metodu (alt sınıflar bu metodu özelleştirebilir)
    public void work() {
        System.out.println(name + " çalışıyor.");
    }

    // Maaş bilgisi
    public void displaySalary() {
        System.out.println(name + " maaşı: " + salary);
    }
}
