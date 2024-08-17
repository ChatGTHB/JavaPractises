package _29_Inheritance._01_Example;

public class Animal {

    // Hayvanların ortak özellikleri: isim ve yaş
    protected String name;
    protected int age;

    // Yapıcı metot (constructor), name ve age özelliklerini başlatır
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Hayvanların ortak bir ses çıkarma davranışı (alt sınıflar bu metodu özelleştirebilir)
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
