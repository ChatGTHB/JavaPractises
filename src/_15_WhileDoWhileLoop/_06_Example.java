package _15_WhileDoWhileLoop;

import java.util.Scanner;

public class _06_Example {
    public static void main(String[] args) {
        // Soru Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int tersSayi = 0;

        // Sayıyı tersine çevirme işlemi
        while (sayi != 0) {
            int basamak = sayi % 10; // Son basamağı al
            tersSayi = tersSayi * 10 + basamak; // Ters sayıya ekle
            sayi /= 10; // Son basamağı sil
        }

        // Ters çevrilmiş sayıyı ekrana yazdırma
        System.out.println("Girilen sayının tersi: " + tersSayi);
    }
}
