package _29_Inheritance._05_Example;

// ITDepartment sınıfı, Department sınıfından miras alır
public class ITDepartment extends Department {

    // Yapıcı metot (constructor), üst sınıftaki yapıcı metodu çağırır
    public ITDepartment(String name, int numberOfEmployees) {
        super(name, numberOfEmployees); // Üst sınıftaki name ve numberOfEmployees özelliklerini başlatır
    }

    // IT departmanı için departman bilgisi metodunu özelleştiriyoruz (override)
    @Override
    public void getDepartmentInfo() {
        System.out.println("IT Departmanı: " + name + ", Çalışan Sayısı: " + numberOfEmployees + ", Odak: Yazılım Geliştirme ve Destek");
    }
}
