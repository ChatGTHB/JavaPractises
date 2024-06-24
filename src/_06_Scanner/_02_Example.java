package _06_Scanner;

import java.util.Scanner;

public class _02_Example {

    public static void main(String[] args) {

        // Kullanıcıdan iki ondalık sayı girmesini isteyin ve bu sayıların toplamını ekrana yazdırın.
        Scanner oku = new Scanner(System.in);

        // Kullanıcıdan birinci ondalık sayıyı girmesini istiyoruz.
        System.out.print("Birinci ondalık sayı = ");
        double sayi1 = oku.nextDouble();

        // Kullanıcıdan ikinci ondalık sayıyı girmesini istiyoruz.
        System.out.print("İkinci ondalık sayı = ");
        double sayi2 = oku.nextDouble();

        // Sayıların toplamını hesaplıyoruz.
        Double toplam = sayi1 + sayi2;

        // Sonucu ekrana yazdırıyoruz.
        System.out.println("Toplam = " + toplam);

    }
}
