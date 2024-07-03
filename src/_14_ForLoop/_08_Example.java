package _14_ForLoop;

import java.util.Scanner;

public class _08_Example {
    public static void main(String[] args) {
        /**
         Kullanıcıdan kaç adet sayı gireceğini isteyen ve
         bu sayıların en büyüğünü ile en küçüğünü bulan
         Java programını yazınız.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceğinizi belirtin: ");
        int n = input.nextInt();

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Bir sayı girin: ");
            int num = input.nextInt();

            if (num > enBuyuk) {
                enBuyuk = num;
            }

            if (num < enKucuk) {
                enKucuk = num;
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        input.close();
    }
}
