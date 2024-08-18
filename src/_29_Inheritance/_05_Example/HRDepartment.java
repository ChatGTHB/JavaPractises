package _29_Inheritance._05_Example;

// HRDepartment sınıfı, Department sınıfından miras alır
public class HRDepartment extends Department {

    // Yapıcı metot (constructor), üst sınıftaki yapıcı metodu çağırır
    public HRDepartment(String name, int numberOfEmployees) {
        super(name, numberOfEmployees); // Üst sınıftaki name ve numberOfEmployees özelliklerini başlatır
    }

    // HR departmanı için departman bilgisi metodunu özelleştiriyoruz (override)
    @Override
    public void getDepartmentInfo() {
        System.out.println("HR Departmanı: " + name + ", Çalışan Sayısı: " + numberOfEmployees + ", Odak: İşe Alım ve Çalışan İlişkileri");
    }
}
