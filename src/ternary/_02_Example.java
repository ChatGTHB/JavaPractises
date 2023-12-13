package ternary;

import java.util.Scanner;

public class _02_Example {
    public static void main(String[] args) {

        // Bir kişinin yaşına göre sinema bileti fiyatını hesaplayan bir Java programı yazın.
        // Sinema bileti fiyatı 60 TL'dir. Ancak yaşa göre indirim uygulanmaktadır.
        // 18 yaşından küçükler için 12 TL, --> İlk durum
        // 18-60 yaş arası için 6 TL, --------> İkinci durum
        // 60 yaşından büyükler için 9 TL ----> Üçüncü durum
        // indirim vardır.
        // Ternary operatörü kullanarak çözün.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        double indirim, fiyat;

        indirim = (yas < 18) ? 12 : (yas >= 18 && yas < 60) ? 6 : 9;
        fiyat=60-indirim;

        System.out.println("Sinema bileti fiyatınız: " + fiyat+ " TL");
    }
}
