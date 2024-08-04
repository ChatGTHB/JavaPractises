package _25_Constructor._04_Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için Scanner nesnesi oluşturulur
        Scanner scanner = new Scanner(System.in);
        // Girilen tüm kişileri saklamak için bir liste oluşturulur
        List<Person> people = new ArrayList<>();

        // Sonsuz döngü, kullanıcı devam etmek istemediğinde kırılacaktır
        while (true) {
            // Kullanıcıdan adı alınır
            System.out.print("Adınızı girin: ");
            String name = scanner.nextLine();

            // Kullanıcıdan yaşı alınır
            System.out.print("Yaşınızı girin: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Yeni satır karakterini temizler

            // Kullanıcıdan hobiler alınır
            List<String> hobbies = new ArrayList<>();
            System.out.print("Hobilerinizi girin (virgülle ayırarak): ");
            String hobbiesInput = scanner.nextLine();
            // Hobiler virgülle ayrılarak listeye eklenir
            for (String hobby : hobbiesInput.split(",")) {
                hobbies.add(hobby.trim()); // Boşlukları temizleyerek listeye ekler
            }

            // Kişi nesnesi oluşturulur ve listeye eklenir
            Person person = new Person(name, age, hobbies);
            people.add(person);

            // Kullanıcıdan başka bir kişi eklemek isteyip istemediği sorulur
            System.out.print("Başka bir kişi eklemek ister misiniz? (evet/hayır): ");
            String continueInput = scanner.nextLine();
            // Eğer kullanıcı "hayır" derse döngü kırılır
            if (continueInput.equalsIgnoreCase("hayır")) {
                break;
            }
        }

        // Tüm kişi bilgilerini ekrana yazdırır
        System.out.println("\nGirilen tüm kişiler:");
        // Her bir kişi için bilgileri ekrana yazdırılır
        for (Person person : people) {
            person.displayInfo();
            System.out.println(); // Her kişinin bilgilerini ayırmak için boş satır
        }

        // Scanner nesnesi kapatılır
        scanner.close();
    }
}
