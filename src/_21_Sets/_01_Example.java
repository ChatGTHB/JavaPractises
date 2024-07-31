package _21_Sets;

import java.util.HashSet;
import java.util.Scanner;

public class _01_Example {
    public static void main(String[] args) {
        /**
         * Task: Bir HashSet oluşturun ve içine kullanıcıdan alacağınız 5 adet String eleman ekleyin.
         * Sonra HashSet’in boyutunu, içindeki elemanları ve “Java” elemanının var olup olmadığını yazdırın.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner input = new Scanner(System.in);

        // Bir HashSet oluşturun
        HashSet<String> hashSet = new HashSet<>();

        // Kullanıcıdan 5 adet String eleman alın
        for (int i = 0; i < 5; i++) {
            System.out.print("Lütfen String bir eleman giriniz: ");
            String kelime = input.nextLine().trim();
            if (!kelime.isEmpty()) {
                hashSet.add(kelime);
            } else {
                System.out.println("Boş girdi kabul edilmez, lütfen geçerli bir kelime giriniz.");
                i--; // Boş girdi durumunda aynı adım tekrar edilsin
            }
        }

        // HashSet'in boyutunu yazdırın
        System.out.println("HashSet'in boyutu: " + hashSet.size());

        // HashSet'in elemanlarını yazdırın
        System.out.println("HashSet'in elemanları: " + hashSet);

        // HashSet'in "Java" elemanını içerip içermediğini yazdırın
        System.out.println("HashSet 'Java' Stringini içeriyor mu? " + hashSet.contains("Java"));

        // Scanner nesnesini kapatın
        input.close();
    }
}
