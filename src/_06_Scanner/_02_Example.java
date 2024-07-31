package _06_Scanner;

import java.util.Scanner;

public class _02_Example {
    /**
     * *2. Task: Kullanıcıdan adını ve yaşını alarak ekrana
     * "Merhaba, {ad}! {yaş} yaşındasın." şeklinde bir çıktı yazdıran bir program yazın.**
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        System.out.println("İsim giriniz: ");
        String name = inputStr.nextLine();

        System.out.println("Yaşınızı giriniz:");
        int yas = input.nextInt();

        System.out.println("Merhaba, " + name + "! " + yas + " yaşındasın.");
    }
}
