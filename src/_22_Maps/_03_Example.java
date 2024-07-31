package _22_Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _03_Example {
    public static void main(String[] args) {
        /**
         * Task:
         * Kullanıcıdan alınan bir cümledeki harflerin sayısını hesaplayan bir Java programı yazın.
         * Program, harfleri alfabetik olarak sıralamalı ve her harfin kaç kez tekrarlandığını yazdırmalıdır.
         */

        // Tarama nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // TreeMap nesnesi oluştur
        TreeMap<Character, Integer> harfler = new TreeMap<>();

        // Kullanıcıdan cümleyi al
        System.out.print("Cümle girin: ");
        String cumle = input.nextLine();

        // Cümledeki harfleri say
        for (int i = 0; i < cumle.length(); i++) {
            char harf = cumle.charAt(i);

            // Harf alfabetik değilse, atla (orijinal metoda sadık kalarak)
            if (!(harf >= 'a' && harf <= 'z') && !(harf >= 'A' && harf <= 'Z')) {
                continue;
            }

            // Harfi küçük harfe çevir
            harf = Character.toLowerCase(harf);

            // Harf TreeMap'te varsa, değerini bir artır, yoksa 1 olarak ekle
            if (harfler.containsKey(harf)) {
                harfler.put(harf, harfler.get(harf) + 1);
            } else {
                harfler.put(harf, 1);
            }
        }

        // TreeMap'i yazdır
        System.out.println("Harf Sayısı:");
        for (Map.Entry<Character, Integer> entry : harfler.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " adet");
        }

        // Scanner nesnesini kapat
        input.close();
    }
}
