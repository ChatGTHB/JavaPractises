package _15_WhileDoWhileLoop;

import java.util.Scanner;

public class _02_Example {
    public static void main(String[] args) {
        // Kullanıcıdan "quit" kelimesi girilene kadar metin girişi alan ve girilen metinleri
        // ekrana yazdıran bir Java programı yazın.

        Scanner input = new Scanner(System.in);
        System.out.println("Metin giriniz : ");
        String giris = input.nextLine();

        while (!giris.equalsIgnoreCase("quit")) {
            System.out.println("Girilen metin : " + giris);
            System.out.println("Metin giriniz (çıkmak için 'quit' yazın) : ");
            giris = input.nextLine();
        }
        System.out.println("Program sonlandırıldı.");
    }
}
