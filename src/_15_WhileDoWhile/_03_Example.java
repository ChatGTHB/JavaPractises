package _15_WhileDoWhile;

import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı girmesini isteyen ve girilen sayı pozitif olduğu sürece
        // ekrana "Merhaba!" yazan bir Java programı yazınız.
        // Kullanıcı negatif bir sayı girdiğinde program sonlanmalıdır.

        Scanner scanner = new Scanner(System.in);
        int sayi;
        do {
            System.out.println("Bir sayı girin (Negatif sayı girilince programdan çıkar): ");
            sayi = scanner.nextInt();
            if (sayi >= 0) {
                System.out.println("Merhaba!");
            }
        } while (sayi >= 0);
        System.out.println("Program sonlandırıldı.");
    }
}