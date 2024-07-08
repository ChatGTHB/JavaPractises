package _15_WhileDoWhile;

import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı girmesini isteyen ve girilen sayı pozitif olduğu sürece
        // ekrana "Merhaba!" yazan bir Java programı yazınız.
        // Kullanıcı negatif bir sayı girdiğinde program sonlanmalıdır.

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("Bir sayı giriniz (Negatif sayı girilince program sonlanır) : ");
            sayi = input.nextInt();
            if (sayi >= 0) {
                System.out.println("Merhaba");
            }
        } while (sayi >= 0);
        System.out.println("Program sonlandı.");
    }
}