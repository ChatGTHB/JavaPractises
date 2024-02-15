package generalReview.ornek06;

import java.util.Scanner;

public class Ornek06 {
    public static void main(String[] args) {

        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = input.nextInt();

        System.out.println("4'ün katları: ");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in katları: ");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i);
        }

    }
}
