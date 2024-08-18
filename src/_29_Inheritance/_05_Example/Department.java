package _29_Inheritance._05_Example;

// Department sınıfı, tüm departmanların ortak özelliklerini ve metotlarını temsil eder
public class Department {

    // Departmanların ortak özellikleri: isim ve çalışan sayısı
    protected String name;
    protected int numberOfEmployees;

    // Yapıcı metot (constructor), name ve numberOfEmployees özelliklerini başlatır
    public Department(String name, int numberOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Ortak bir departman bilgisi metodu (alt sınıflar bu metodu özelleştirebilir)
    public void getDepartmentInfo() {
        System.out.println("Departman Adı: " + name + ", Çalışan Sayısı: " + numberOfEmployees);
    }
}
