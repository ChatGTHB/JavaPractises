package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _04_Example {
    public static void main(String[] args) {
        /**
         * Soru: Kullanıcıdan bir dizi kelime alın ve bu kelimelerden benzersiz olanları bir Set kullanarak bulun.
         * Ayrıca, kelimelerin kaç kez tekrarlandığını hesaplayarak bir Map kullanarak saklayın.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç kelime gireceğini alın
        System.out.print("Kaç kelime gireceksiniz: ");
        int kelimeSayisi = scanner.nextInt();
        scanner.nextLine(); // Satır sonu karakterini temizleyin

        // Kullanıcıdan kelimeleri alın
        String[] kelimeler = new String[kelimeSayisi];
        System.out.println("Lütfen kelimeleri giriniz:");
        for (int i = 0; i < kelimeSayisi; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeler[i] = scanner.nextLine();
        }

        // Benzersiz kelimeleri ve kelime tekrar sayılarını hesaplayın
        Set<String> benzersizKelimeler = new HashSet<>();
        Map<String, Integer> kelimeTekrarSayilari = new HashMap<>();

        for (String kelime : kelimeler) {
            // Benzersiz kelimeler setine ekleyin
            benzersizKelimeler.add(kelime);

            // Kelime tekrar sayılarını hesaplayın
            if (kelimeTekrarSayilari.containsKey(kelime)) {
                kelimeTekrarSayilari.put(kelime, kelimeTekrarSayilari.get(kelime) + 1);
            } else {
                kelimeTekrarSayilari.put(kelime, 1);
            }
        }

        // Benzersiz kelimeleri yazdırın
        System.out.println("Benzersiz Kelimeler: " + benzersizKelimeler);

        // Kelime tekrar sayılarını yazdırın
        System.out.println("Kelime Tekrar Sayıları:");
        for (Map.Entry<String, Integer> entry : kelimeTekrarSayilari.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Scanner nesnesini kapatın
        scanner.close();
    }
}
