package _26_AccessModifiersAndNonAccessModifiers._09_Example;

public class Employee {
    // private final değişken: İlk atanan değeri sabit kalır ve değiştirilemez
    private final int id;

    // Kurucu: Kimlik değişkenine değer atanır
    public Employee(int id) {
        this.id = id;
    }

    // Kimlik değerini ekrana yazdıran metod
    public void printId() {
        System.out.println("Employee ID: " + id);
    }
}
