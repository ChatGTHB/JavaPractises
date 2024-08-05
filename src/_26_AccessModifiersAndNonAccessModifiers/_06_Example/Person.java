package _26_AccessModifiersAndNonAccessModifiers._06_Example;

public class Person {
    // private değişken: Sadece aynı sınıf içinden erişilebilir
    private String name = "John Doe";

    // public metod: İsim değişkenini ekrana yazdırır
    public void printName() {
        System.out.println("Name: " + name);
    }
}
