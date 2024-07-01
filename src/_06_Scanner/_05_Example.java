package _06_Scanner;

import java.util.Scanner;

public class _05_Example {

    public static void main(String[] args) {

        /**
         **5. Soru: Doğum yılı girilen kişinin yaşını hesaplayan bir program yazınız**
         * Not= İçinde bulunulan yıl kullanıcıdan alınacak.
         */

        int dogumYili,guncelYil;

        Scanner input=new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        dogumYili=input.nextInt();

        System.out.println("İçinde bulunduğunuz yılı giriniz: ");
        guncelYil=input.nextInt();

        System.out.println((guncelYil-dogumYili)+" yaşındasınız!");
    }
}
