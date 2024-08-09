package _27_Enum._06_Example;

import java.util.Scanner;

/**
 * Main sınıfı, kullanıcıdan içecek siparişi alıp bu siparişi işleten ana programı içerir.
 */
public class Main {
    public static void main(String[] args) {
        // Kullanıcının seçtiği içecek, enum sabiti olarak alınır.
        Drinks selectedDrink = takeSelectDrink();

        // Kullanıcıdan içeceğin kaç adet istendiği bilgisi alınır.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet? ");
        int pcs = scanner.nextInt();

        // Yeni bir sipariş nesnesi oluşturulur ve içecek eklenir.
        Order order = new Order();
        order.addOrder(selectedDrink, pcs);

        // Sipariş detayları ekrana yazdırılır.
        order.showOrderDetails();
    }

    /**
     * Kullanıcıya sunulan içecek seçeneklerini gösterir ve geçerli bir seçim yapılmasını sağlar.
     *
     * @return Seçilen içecek türünü temsil eden enum sabiti (Drinks)
     */
    private static Drinks takeSelectDrink() {
        System.out.println("İçecek Seçiniz:");

        // Enum'daki tüm içecekleri ekrana yazdırır.
        for (Drinks drink : Drinks.values()) {
            System.out.println(drink.ordinal() + 1 + ". " + drink.getAd());
        }

        // Kullanıcının yaptığı seçim alınır ve geçerliliği kontrol edilir.
        Scanner scanner = new Scanner(System.in);
        int selection;
        do {
            System.out.print("Seçiminizi yapınız (1-" + Drinks.values().length + "): ");
            selection = scanner.nextInt();
        } while (selection < 1 || selection > Drinks.values().length); // Geçerli bir seçim yapılana kadar tekrar sorulur.

        // Kullanıcının seçimine göre ilgili enum sabiti döndürülür.
        return Drinks.values()[selection - 1];
    }
}

/*
Özet:
- Main sınıfı, programın giriş noktasıdır ve kullanıcıdan alınan verileri işleyip sipariş oluşturur.
- Kullanıcıdan alınan seçimler, enum sabitleri (Drinks) olarak saklanır.
- Enum'lar sayesinde, sadece tanımlı içeceklerin seçilmesi garanti altına alınır.
- Sipariş detayları, Order sınıfı tarafından işlenir ve gösterilir.
*/
