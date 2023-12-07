package scanner;

import java.util.Scanner;

public class _01_Example {

    // **1. Soru: Kullanıcıdan bir isim alarak ekrana ekrana
    // "Merhaba, {ad}!" şeklinde bir çıktı yazdıran bir program yazın.**

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İsim giriniz: ");
        // String isim2= input.next();
        String isim= input.nextLine();
        System.out.println("Merhaba, "+isim+"!");
    }
}
