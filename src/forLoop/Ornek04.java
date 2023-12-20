package forLoop;

import java.util.Scanner;

public class Ornek04 {
    public static void main(String[] args) {

        // Girilen metni tersten yazdıran bir Java programı yazınız.
        // For döngüsü kullanınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz: ");
        String duzMetin = input.nextLine();
        System.out.println("duzMetin.length() = " + duzMetin.length());
        String tersMetin = "";

        for (int i = duzMetin.length() - 1; i >= 0; i--) {
            tersMetin = tersMetin + duzMetin.charAt(i);
            // tersMetin+=duzMetin.charAt(i);
        }

        System.out.println("Girdiğiniz metnin ters çevrilmiş hali: " + tersMetin);

    }
}
