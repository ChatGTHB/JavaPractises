package _21_Sets;

import java.util.HashSet;
import java.util.Scanner;

public class _05_Example {
    public static void main(String[] args) {
        /**
         * Soru: Kullanıcıdan iki farklı kelime listesi alın ve bu iki kelime listesinin kesişiminde
         * bulunan (ortak) kelimeleri bir Set kullanarak bulun.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ilk kelime listesinin boyutunu alın
        System.out.print("İlk kelime listesinin boyutunu giriniz: ");
        int boyut1 = scanner.nextInt();
        scanner.nextLine(); // Satır sonu karakterini temizleyin

        // İlk kelime listesini oluşturun ve kullanıcıdan kelimeleri alın
        HashSet<String> kelimeListesi1 = new HashSet<>();
        System.out.println("Lütfen ilk kelime listesindeki kelimeleri giriniz:");
        for (int i = 0; i < boyut1; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeListesi1.add(scanner.nextLine());
        }

        // Kullanıcıdan ikinci kelime listesinin boyutunu alın
        System.out.print("İkinci kelime listesinin boyutunu giriniz: ");
        int boyut2 = scanner.nextInt();
        scanner.nextLine(); // Satır sonu karakterini temizleyin

        // İkinci kelime listesini oluşturun ve kullanıcıdan kelimeleri alın
        HashSet<String> kelimeListesi2 = new HashSet<>();
        System.out.println("Lütfen ikinci kelime listesindeki kelimeleri giriniz:");
        for (int i = 0; i < boyut2; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeListesi2.add(scanner.nextLine());
        }

        // İki kelime listesinin kesişimini bulun
        HashSet<String> ortakKelimeler = new HashSet<>(kelimeListesi1);
        ortakKelimeler.retainAll(kelimeListesi2);

        // Ortak kelimeleri yazdırın
        System.out.println("Ortak Kelimeler: " + ortakKelimeler);

        // Scanner nesnesini kapatın
        scanner.close();
    }
}

