package _28_Encapsulation._01_Example;

public class EncapsulationExample {
    public static void main(String[] args) {
        // Person sınıfından bir nesne oluşturuyoruz
        Person hazar = new Person();

        // "name" özelliğini "Hazar" olarak ayarlıyoruz
        hazar.name="Hazar";

        // "age" özelliğini 30 olarak ayarlıyoruz
        hazar.setAge(30);

        // Nesnenin name özelliğini alıyoruz ve ekrana yazdırıyoruz
        System.out.println("Kişinin adı: " + hazar.name);

        // Nesnenin age özelliğini alıyoruz ve ekrana yazdırıyoruz
        System.out.println("Kişinin yaşı: " + hazar.getAge());
    }
}
