package constructor._01_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        // Person nesnelerini saklamak için bir ArrayList oluşturuluyor
        ArrayList<Person> persons = new ArrayList<>();

        // Kullanıcıdan veri almak için döngü başlatılıyor
        while (devam) {
            System.out.println("1. Yeni kişi ekle ");
            System.out.println("2. Çıkış ");
            System.out.print("Seçim : ");
            int secim = scanner.nextInt(); // Kullanıcının seçim yapması isteniyor
            scanner.nextLine(); // Tampon temizleme

            switch (secim) {
                case 1:
                    // Kullanıcıdan kişi bilgileri alınıyor
                    System.out.print("Kişi Adı : ");
                    String ad = scanner.nextLine(); // Kullanıcıdan adı alınır
                    System.out.print("Kişi Yaşı : ");
                    int yas = scanner.nextInt(); // Kullanıcıdan yaşı alınır
                    scanner.nextLine(); // Tampon temizleme
                    System.out.print("Hobileri (virgülle ayırarak girin) : ");
                    String hobilerStr = scanner.nextLine(); // Kullanıcıdan hobileri alınır
                    String[] hobiler = hobilerStr.split(","); // Hobiler virgül ile ayrılarak diziye dönüştürülür

                    // Yeni bir Person nesnesi oluşturuluyor ve bilgiler setPersonInfo metodu ile ayarlanıyor
                    Person person = new Person();
                    person.setPersonInfo(ad, yas, hobiler); // Kişi bilgileri ayarlanır
                    persons.add(person); // Kişi listeye eklenir
                    break;
                case 2:
                    // Program sonlandırılıyor
                    devam = false; // Döngüyü sonlandırır
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    // Geçersiz seçim durumu
                    System.out.println("Geçersiz seçim lütfen tekrar deneyiniz");
                    break;
            }
        }

        // Tüm kişilerin bilgileri yazdırılıyor
        for (Person person : persons) {
            person.displayInfo(); // Kişi bilgileri ekrana yazdırılır
        }
    }
}
