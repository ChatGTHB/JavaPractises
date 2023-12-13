package ifElse;

import java.util.Scanner;

public class _04_Example {
    public static void main(String[] args) {

        // Soru: Bir kişinin cinsiyetini belirleyen bir Java programı yazın.
        // Program, kullanıcıdan “E” veya “K” harflerinden birini girmesini istemeli
        // ve ekrana “Erkek” veya “Kadın” mesajını yazdırmalıdır.
        // Farklı bir değer girilirse "Geçersiz Giriş" uyarısını versin.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetini giriniz (E/K)");
        char cinsiyet = input.next().toUpperCase().charAt(0);

        if (cinsiyet == 'E') {
            System.out.println("Erkek");
        } else if (cinsiyet == 'K') {
            System.out.println("Kadın");
        } else {
            System.out.println("Geçersiz giriş.");
        }
    }
}
