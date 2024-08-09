package _27_Enum._05_Example;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // Kullanıcıdan orijinal fiyatı alın
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürünün orijinal fiyatını giriniz: ");
        double originalPrice = scanner.nextDouble();

        // Kullanıcıdan günü seçmesini iste
        DaysOfWeek today = takeSelectDay();

        // Seçilen günün indirimli fiyatını hesapla
        double discountedPrice = today.calculateDiscountedPrice(originalPrice);

        // Sonuçları ekrana yazdır
        System.out.println("Bugün günlerden: " + today);
        System.out.println("İndirim oranı: %" + today.getDiscountPercentage());
        System.out.println("İndirimli fiyat: " + discountedPrice + " TL");
    }

    // Kullanıcıdan gün seçmesini sağlayan yardımcı metot
    private static DaysOfWeek takeSelectDay() {
        System.out.println("Gün Seçiniz:");

        // Enum'daki tüm günleri ekrana yazdırır
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day.ordinal() + 1 + ". " + day);
        }

        // Kullanıcının yaptığı seçim alınır ve geçerliliği kontrol edilir
        Scanner scanner = new Scanner(System.in);
        int selection;
        do {
            System.out.print("Seçiminizi yapınız (1-" + DaysOfWeek.values().length + "): ");
            selection = scanner.nextInt();
        } while (selection < 1 || selection > DaysOfWeek.values().length);

        // Kullanıcının seçimine göre ilgili enum sabiti döndürülür
        return DaysOfWeek.values()[selection - 1];
    }
}
