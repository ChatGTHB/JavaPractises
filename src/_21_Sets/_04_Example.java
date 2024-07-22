package _21_Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _04_Example {
    public static void main(String[] args) {
        /**
         Soru: Bir dizi içindeki yinelenen sayıları bulup
         bir Set kullanarak geri döndüren bir Java metodu yazınız.
         Dizinin elemanlarını kullanıcıdan alınız.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu alın
        System.out.print("Lütfen dizinin boyutunu giriniz:");
        int boyut = scanner.nextInt();

        // Bir dizi oluşturun
        int[] sayilar = new int[boyut];

        // Kullanıcıdan dizinin elemanlarını alın
        System.out.println("Lütfen " + boyut + " adet sayı giriniz:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();
        }

        // Yinelenen sayıları bulan metodu çağırın
        Set<Integer> yinelenenSayilar = yinelenenleriBul(sayilar);

        // Yinelenen sayıları yazdırın
        System.out.println("Yinelenen Sayılar: " + yinelenenSayilar);

        // Scanner nesnesini kapatın
        scanner.close();
    }

    public static Set<Integer> yinelenenleriBul(int[] dizi) {
        Set<Integer> yinelenenler = new HashSet<>();
        Set<Integer> tekilElemanlar = new HashSet<>();

        for (int sayi : dizi) {
            // Eğer eleman daha önce eklenmemişse tekilElemanlar setine ekle
            // Eğer eleman zaten eklenmişse yinelenenler setine ekle
            if (!tekilElemanlar.add(sayi)) {
                yinelenenler.add(sayi);
            }
        }
        return yinelenenler;
    }
}