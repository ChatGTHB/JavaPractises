package _26_AccessModifiersAndNonAccessModifiers._01_Example;

public class Person {
    // public değişken: Her yerden erişilebilir
    public String publicName = "John";

    // private değişken: Sadece aynı sınıf içinden erişilebilir
    private int privateAge = 30;

    // protected değişken: Aynı paket içinden ve alt sınıflardan erişilebilir
    protected String protectedGender = "Male";

    // default (package-private) değişken: Sadece aynı paket içinden erişilebilir
    String defaultAddress = "123 Main St";
}
