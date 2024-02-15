package generalReview.ornek05;

import java.util.Scanner;

public class Ornek05 {
    public static void main(String[] args) {

        int sayi, toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi = input.nextInt();

            if (sayi % 4 == 0 && sayi != 0) {
                toplam += sayi;
            }
            /**
             sayi != 0 ifadesi, girilen sayının sıfırdan farklı olup olmadığını kontrol eder.
             Bu ifade, sıfırın toplama işlemine etkisini engellemek için kullanılır.
             Eğer girilen sayı sıfıra eşitse, bu durumda toplam değişkenine eklenmez.
             Bu ifadelerin kullanılması, programın sadece çift ve 4'ün katı olan sayıları
             toplamasını sağlar ve sıfırın toplama işlemine etkisini engeller.
             */
        } while (sayi % 2 == 0);
        System.out.println("Toplam = " + toplam);
    }
}
