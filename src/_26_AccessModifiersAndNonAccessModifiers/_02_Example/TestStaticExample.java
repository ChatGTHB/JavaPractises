package _26_AccessModifiersAndNonAccessModifiers._02_Example;

public class TestStaticExample {
    public static void main(String[] args) {
        // Static değişken: Sınıf adı üzerinden erişilebilir
        System.out.println("Static Variable: " + StaticExample.staticVar);

        // Static metod: Sınıf adı üzerinden çağrılabilir
        StaticExample.staticMethod();
    }
}
