package _06_Scanner;

import java.util.Scanner;

public class _03_Example {

    public static void main(String[] args) {

        /**
         // **3. Soru: Kullanıcıdan bir tamsayı alarak,
         sayının karesini ekrana yazdıran bir program yazın.**
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Bir tamsayı giriniz: ");
        int sayi = input.nextInt();

        int sayiKare = sayi * sayi;
        System.out.println("Girdiğiniz sayının karesi = " + sayiKare + "'dir.");
    }
}
