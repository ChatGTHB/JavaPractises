package _22_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_Example {
    public static void main(String[] args) {
        /**
         * Task:
         * Bir metindeki her kelimenin kaç kez geçtiğini sayan ve
         * sonucu bir HashMap’te saklayan bir Java programı yazınız.
         * Programınız, metni kullanıcıdan alacak ve
         * HashMap’i standart çıktıya yazdıracaktır.
         */

        // Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);
        // HashMap nesnesi oluştur
        Map<String, Integer> kelimeSayaci = new HashMap<>();
        // Cümleyi oku
        System.out.print("Lütfen bir cümle girin: ");
        String cumle = input.nextLine();
        // Cümleyi kelimelere ayır
        String[] kelimeler = cumle.split("\\s+");
        // Her kelime için
        for (String kelime : kelimeler) {
            // Kelimeyi küçük harfe çevir ve noktalama işaretlerini temizle
            kelime = kelime.toLowerCase().replaceAll("[^a-zA-Z]", "");
            // Eğer kelime haritada varsa, değerini bir artır
            if (kelimeSayaci.containsKey(kelime)) {
                kelimeSayaci.put(kelime, kelimeSayaci.get(kelime) + 1);
            } else {
                // Eğer kelime haritada yoksa, değerini 1 olarak ekle
                kelimeSayaci.put(kelime, 1);
            }
        }
        // HashMap'i yazdır
        System.out.println("Kelime sayıları: ");
        for (Map.Entry<String, Integer> entry : kelimeSayaci.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Scanner nesnesini kapat
        input.close();
    }
}
