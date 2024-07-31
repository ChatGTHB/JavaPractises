package _06_Scanner;

import java.util.Scanner;

public class _04_Example {

    public static void main(String[] args) {

        /**
         Task: Kullanıcıdan iki tamsayı alarak,
         bu sayıların toplamını, farkını ve çarpımını
         ekrana yazdıran bir program yazın.
         */

        int sayi1,sayi2,sayiToplam,sayiFark,sayiÇarpim;

        Scanner input=new Scanner(System.in);

        System.out.println("Birinci tamsayıyı giriniz:");
        sayi1=input.nextInt();

        System.out.println("İkinci tamsayıyı giriniz:");
        sayi2=input.nextInt();

        sayiToplam=sayi1+sayi2;
        sayiFark=sayi1-sayi2;
        sayiÇarpim=sayi1*sayi2;

        System.out.println("sayiToplam = " + sayiToplam);
        System.out.println("sayiFark = " + sayiFark);
        System.out.println("sayiÇarpim = " + sayiÇarpim);
    }
}
