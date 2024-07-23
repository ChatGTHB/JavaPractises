package _22_Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _05_Example {
    public static void main(String[] args) {
        /**
         * Soru:
         * Kullanıcıdan bir dizi kelime alın ve bu kelimelerden en uzun ve en kısa olanlarını bulun.
         * Ayrıca, her kelimenin kaç kez tekrarlandığını hesaplayarak sonucu yazdırın.
         * Program aşağıdaki adımları gerçekleştirmelidir:
         * 1. Kullanıcıdan kaç kelime gireceğini alın.
         * 2. Kullanıcıdan belirtilen sayıda kelime alın.
         * 3. Her kelimenin kaç kez tekrarlandığını hesaplayın.
         * 4. En uzun ve en kısa kelimeleri bulun.
         * 5. En uzun ve en kısa kelimeleri ve her kelimenin tekrar sayısını yazdırın.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç kelime gireceğini alın
        System.out.print("Kaç kelime gireceksiniz: ");
        int kelimeSayisi = scanner.nextInt();

        // `nextInt()` metodu yalnızca sayıyı okur ve Enter tuşuna basıldığında oluşan newline karakterini (`\n`) bırakır.
        // Bu nedenle, bir sonraki `nextLine()` çağrısı boş bir değer döner.
        // Bunu önlemek için, newline karakterini okumak ve atlamak için `scanner.nextLine()` çağrısı yapılır.
        scanner.nextLine(); // Satır sonu karakterini temizleyin

        // Kullanıcıdan kelimeleri alın
        String[] kelimeler = new String[kelimeSayisi];
        System.out.println("Lütfen kelimeleri giriniz:");
        for (int i = 0; i < kelimeSayisi; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeler[i] = scanner.nextLine().trim(); // Kelimeyi alırken boşlukları temizleyin
        }

        // Kelime tekrar sayılarını hesaplayın
        Map<String, Integer> kelimeTekrarSayilari = new HashMap<>();
        Set<String> enUzunKelimeler = new HashSet<>();
        Set<String> enKisaKelimeler = new HashSet<>();

        // İlk kelimenin uzunluğunu referans alalım
        int maxUzunluk = kelimeler[0].length();
        int minUzunluk = kelimeler[0].length();

        for (String kelime : kelimeler) {
            // Kelime tekrar sayılarını hesaplayın
            if (kelimeTekrarSayilari.containsKey(kelime)) {
                kelimeTekrarSayilari.put(kelime, kelimeTekrarSayilari.get(kelime) + 1);
            } else {
                kelimeTekrarSayilari.put(kelime, 1);
            }

            // En uzun kelimeleri bulun
            if (kelime.length() > maxUzunluk) {
                maxUzunluk = kelime.length();
                enUzunKelimeler.clear();
                enUzunKelimeler.add(kelime);
            } else if (kelime.length() == maxUzunluk) {
                enUzunKelimeler.add(kelime);
            }

            // En kısa kelimeleri bulun
            if (kelime.length() < minUzunluk) {
                minUzunluk = kelime.length();
                enKisaKelimeler.clear();
                enKisaKelimeler.add(kelime);
            } else if (kelime.length() == minUzunluk) {
                enKisaKelimeler.add(kelime);
            }
        }

        // En uzun ve en kısa kelimeleri yazdırın
        System.out.println("\nEn Uzun Kelimeler: " + enUzunKelimeler);
        System.out.println("En Kısa Kelimeler: " + enKisaKelimeler);

        // Kelime tekrar sayılarını yazdırın
        System.out.println("\nKelime Tekrar Sayıları:");
        for (Map.Entry<String, Integer> entry : kelimeTekrarSayilari.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Scanner nesnesini kapatın
        scanner.close();
    }
}
