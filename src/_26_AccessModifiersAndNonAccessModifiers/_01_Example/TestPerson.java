package _26_AccessModifiersAndNonAccessModifiers._01_Example;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();

        // Public değişken: Erişilebilir
        System.out.println("Public Name: " + person.publicName);

        // Private değişken: Erişilemez, derleme hatası verir
        // System.out.println("Private Age: " + person.privateAge);

        // Protected değişken: Aynı paket içinde olduğumuz için erişilebilir
        System.out.println("Protected Gender: " + person.protectedGender);

        // Default değişken: Aynı paket içinde olduğumuz için erişilebilir
        System.out.println("Default Address: " + person.defaultAddress);
    }
}
