package _15_WhileDoWhileLoop;

import java.util.Scanner;

public class _08_Example {
    public static void main(String[] args) {
        // Soru Kullanıcından 10 sayı isteyiniz, eğer sonra girilen önce girilenden büyük ise döngü sonlansın.

        Scanner scanner = new Scanner(System.in);

        int oncekiSayi = Integer.MAX_VALUE; // İlk karşılaştırma için büyük bir değer
        boolean dahaBuyuk = false;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            int mevcutSayi = scanner.nextInt();

            if (mevcutSayi > oncekiSayi) {
                dahaBuyuk = true;
                break; // Döngüyü sonlandır
            }
            oncekiSayi = mevcutSayi; // Mevcut sayıyı bir sonraki karşılaştırma için sakla
        }

        if (dahaBuyuk) {
            System.out.println("Döngü sonlandırıldı çünkü son girilen sayı önce girilenden büyük.");
        } else {
            System.out.println("Tüm sayılar başarıyla girildi.");
        }
        scanner.close();
    }
}
