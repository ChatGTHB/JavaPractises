package _06_Scanner;

import java.util.Scanner;

public class _03_Example {

    public static void main(String[] args) {

        // Kullanıcıdan adını, soyadını, yaşını ve şehrini girmesini isteyin,
        // ardından bu bilgileri birleştirerek ekrana
        // "Adınız: [ad], Soyadınız: [soyad], Yaşınız: [yaş], Şehriniz: [sehir]" şeklinde yazdırın.

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan adını girmesini istiyoruz.
        System.out.println("Adınızı giriniz: ");
        String ad = input.nextLine();

        // Kullanıcıdan soyadını girmesini istiyoruz.
        System.out.println("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        // Kullanıcıdan yaşını girmesini istiyoruz.
        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        input.nextLine();

        // Kullanıcıdan şehrini girmesini istiyoruz.
        System.out.println("Bulunduğunuz şehri giriniz: ");
        String sehir= input.nextLine();

        // Girilen bilgileri ekrana yazdırıyoruz.
        System.out.println("Adınız: " + ad + ", Soyadınız: " + soyad + ", Yaşınız: " + yas+ ", Şehriniz: "+sehir);
    }
}
