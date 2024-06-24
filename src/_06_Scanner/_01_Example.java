package _06_Scanner;

import java.util.Scanner;

public class _01_Example {

    public static void main(String[] args) {

        // Kullanıcıdan bir tam sayı girmesini isteyin ve bu sayıyı 3 ile çarpıp sonucu ekrana yazdırın.

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girmesini istiyoruz.
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = input.nextInt();

        // Sayıyı 3 ile çarpıyoruz.
        int sonuc = sayi * 3;

        // Sonucu ekrana yazdırıyoruz.
        System.out.println("Sonuç = " + sonuc);
    }
}
