package _25_Constructor._04_Example;

public class Person {
    // Kişinin adı, yaşı ve hobileri için değişkenler tanımlanıyor
    private String name;
    private int age;
    private String[] hobbies;

    // Kişi bilgilerini ayarlamak için setPersonInfo metodu
    public void setPersonInfo(String name, int age, String[] hobbies) {
        this.name = name; // Ad bilgisi ayarlanır
        this.age = age; // Yaş bilgisi ayarlanır
        this.hobbies = hobbies; // Hobiler bilgisi ayarlanır
    }

    // Kişi bilgilerini ekrana yazdırmak için displayInfo metodu
    public void displayInfo() {
        System.out.println("Kişi Adı : " + this.name); // Ad bilgisi yazdırılır
        System.out.println("Kişi Yaşı : " + this.age); // Yaş bilgisi yazdırılır
        System.out.print("Hobileri : ");
        for (String hobby : this.hobbies) { // Hobiler yazdırılır
            System.out.print(hobby.trim() + " "); // Her hobi ekrana yazdırılır
        }
        System.out.println();
    }
}
