package _18_Methods;

import java.util.Scanner;

public class _06_Example {

    /*
     * Task: Bir hesap makinesi uygulaması yazın. Kullanıcıya toplama, çıkarma, çarpma ve bölme işlemleri için seçenekler sunun.
     * Kullanıcı, işlem seçtikten sonra iki sayı girecek ve sonucu hesaplayacak.
     *
     * Metot kullanarak her bir işlemi gerçekleştirin (toplama, çıkarma, çarpma, bölme).
     * Ayrıca, kullanıcıdan giriş almak için metotlar kullanın.
     */

    public static void main(String[] args) {

        // Sonsuz bir döngü oluşturuyoruz, kullanıcı çıkış yapmak isteyene kadar çalışacak.
        while (true) {
            // Kullanıcıya seçenekleri gösteriyoruz.
            System.out.println("Hesap Makinesi");
            System.out.println("1. Toplama(+) için 1");
            System.out.println("2. Çıkarma(-) için 2");
            System.out.println("3. Çarpma (x) için 3");
            System.out.println("4. Bölme  (/) için 4");
            System.out.print("5. Çıkış için 1-2-3-4 den farklı bir rakam : ");

            // Kullanıcının seçim yapmasını bekliyoruz.
            int secim = scannerInt();
            // Kullanıcı çıkış yapmak isterse döngüden çıkıyoruz.
            if (secim != 1 && secim != 2 && secim != 3 && secim != 4) {
                System.out.println("Hesap makinesi kapatılıyor..");
                return;
            }

            // Kullanıcıdan birinci sayıyı girmesini istiyoruz.
            System.out.print("Birinci sayıyı giriniz : ");
            double sayi1 = scannerDouble();

            // Kullanıcıdan ikinci sayıyı girmesini istiyoruz.
            System.out.print("İkinci sayıyı giriniz : ");
            double sayi2 = scannerDouble();

            // Seçime göre hesaplama yapıyoruz ve sonucu alıyoruz.
            double sonuc = HesaplamaYap(secim, sayi1, sayi2);
            // Sonucu ekrana yazdırıyoruz.
            System.out.println("Sonuç : " + sonuc);
        }
    }

    // Kullanıcıdan tam sayı girmesini isteyen metot.
    public static int scannerInt() {
        // Scanner nesnesi oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);
        // Kullanıcının girdiği tam sayıyı döndürüyoruz.
        return scanner.nextInt();
    }

    // Kullanıcıdan ondalıklı sayı girmesini isteyen metot.
    public static double scannerDouble() {
        // Scanner nesnesi oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);
        // Kullanıcının girdiği ondalıklı sayıyı döndürüyoruz.
        return scanner.nextDouble();
    }

    // Seçime göre ilgili hesaplamayı yapan metot.
    public static double HesaplamaYap(int secim, double sayi1, double sayi2) {
        double sonuc = 0;
        // Seçime göre uygun işlemi yapıyoruz.
        switch (secim) {
            case 1:
                sonuc = toplam(sayi1, sayi2); // Toplama işlemi
                break;
            case 2:
                sonuc = cikarma(sayi1, sayi2); // Çıkarma işlemi
                break;
            case 3:
                sonuc = carpma(sayi1, sayi2); // Çarpma işlemi
                break;
            case 4:
                sonuc = bolme(sayi1, sayi2); // Bölme işlemi
                break;
        }
        return sonuc; // Sonucu döndürüyoruz.
    }

    // İki sayının toplamını hesaplayan metot.
    public static double toplam(double sayi1, double sayi2) {
        // İki sayıyı toplayıp sonucu döndürüyoruz.
        return sayi1 + sayi2;
    }

    // İki sayının farkını hesaplayan metot.
    public static double cikarma(double sayi1, double sayi2) {
        // İki sayıyı çıkarıp sonucu döndürüyoruz.
        return sayi1 - sayi2;
    }

    // İki sayının çarpımını hesaplayan metot.
    public static double carpma(double sayi1, double sayi2) {
        // İki sayıyı çarpıp sonucu döndürüyoruz.
        return sayi1 * sayi2;
    }

    // İki sayının bölümünü hesaplayan metot.
    public static double bolme(double sayi1, double sayi2) {
        // Bölme işlemi için ikinci sayının sıfır olup olmadığını kontrol ediyoruz.
        if (sayi2 != 0) {
            // Sayıları bölüp sonucu döndürüyoruz.
            return sayi1 / sayi2;
        } else {
            // Bölme işleminde ikinci sayı sıfırsa hata mesajı veriyoruz ve -1 döndürüyoruz.
            System.out.println("Hata : Bölme işlemi için ikinci sayı sıfır olamaz.");
            return -1;
        }
    }
}
