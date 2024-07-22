package _15_WhileDoWhileLoop;

import java.util.Scanner;

public class _07_Example {
    public static void main(String[] args) {
        // Kullanıcının istediği genişlik ve uzunluktaki dikdörtgeni,
        // verilen bir karakterle oluşturan bir Java programı yazınız.

        // Scanner nesnesi oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir karakter girmesini istiyoruz
        System.out.print("Bir karakter giriniz: ");
        String karakter = scanner.nextLine();

        // Kullanıcıdan genişlik girmesini istiyoruz
        System.out.print("Genişlik giriniz: ");
        int genislik = scanner.nextInt();

        // Kullanıcıdan uzunluk girmesini istiyoruz
        System.out.print("Uzunluk giriniz: ");
        int uzunluk = scanner.nextInt();

        // Dikdörtgeni oluşturan döngüleri başlatıyoruz
        int satir = 1;
        while (satir <= uzunluk) {
            int sutun = 1;
            while (sutun <= genislik) {
                System.out.print(karakter); // Karakteri basıyoruz
                sutun++;
            }
            System.out.println(); // Yeni satıra geçiyoruz
            satir++;
        }
        // Scanner nesnesini kapatıyoruz
        scanner.close();
    }
}
