package _22_Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _04_Example {
    public static void main(String[] args) {
        /**
         * Soru:
         * Kullanıcıdan bir dizi kelime alın ve bu kelimeleri tekrar edenleri çıkararak saklayın.
         * Ayrıca, her kelimenin kaç kez tekrarlandığını hesaplayarak sonucu yazdırın.
         * Program aşağıdaki adımları gerçekleştirmelidir:
         * 1. Kullanıcıdan kaç kelime gireceğini alın.
         * 2. Kullanıcıdan belirtilen sayıda kelime alın.
         * 3. Her kelimenin kaç kez tekrarlandığını hesaplayın.
         * 4. Tekrar eden kelimeleri çıkararak saklayın.
         * 5. Benzersiz kelimeleri ve her kelimenin tekrar sayısını yazdırın.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç kelime gireceğini alın
        System.out.print("Kaç kelime gireceksiniz: ");
        int kelimeSayisi = scanner.nextInt();

        // nextInt() metodu yalnızca sayıyı okur ve Enter tuşuna basıldığında oluşan newline karakterini (\n) bırakır.
        // Bu nedenle, bir sonraki nextLine() çağrısı boş bir değer döner.
        // Bunu önlemek için, newline karakterini okumak ve atlamak için scanner.nextLine() çağrısı yapılır.
        scanner.nextLine(); // Satır sonu karakterini temizleyin

        // Kullanıcıdan kelimeleri alın
        String[] kelimeler = new String[kelimeSayisi];
        System.out.println("Lütfen kelimeleri giriniz:");
        for (int i = 0; i < kelimeSayisi; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeler[i] = scanner.nextLine().trim(); // Kelimeyi alırken boşlukları temizleyin
        }

        // Kelime tekrar sayılarını hesaplayın ve benzersiz kelimeleri saklayın
        Set<String> benzersizKelimeler = new HashSet<>(); // Benzersiz kelimeleri saklamak için bir Set
        Map<String, Integer> kelimeTekrarSayilari = new HashMap<>(); // Kelime tekrar sayılarını saklamak için bir Map

        for (String kelime : kelimeler) {
            // Kelime tekrar sayılarını hesaplayın
            if (kelimeTekrarSayilari.containsKey(kelime)) {
                kelimeTekrarSayilari.put(kelime, kelimeTekrarSayilari.get(kelime) + 1);
            } else {
                kelimeTekrarSayilari.put(kelime, 1);
            }

            // Benzersiz kelimeler setine ekleyin
            benzersizKelimeler.add(kelime);
        }

        // Benzersiz kelimeleri yazdırın
        System.out.println("\nBenzersiz Kelimeler: " + benzersizKelimeler);

        // Kelime tekrar sayılarını yazdırın
        System.out.println("\nKelime Tekrar Sayıları:");
        for (Map.Entry<String, Integer> entry : kelimeTekrarSayilari.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Scanner nesnesini kapatın
        scanner.close();
    }
}
