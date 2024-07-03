package _14_ForLoop;

import java.util.Scanner;

public class _06_Example {
    public static void main(String[] args) {
        // Kullanıcıdan bir kelime alıp, aşağıdaki gibi yazdıran Java programı yazınız.
        // Girilen metin: "Kelime"

        // e
        // me
        // ime
        // lime
        // elime
        // Kelime

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir kelime girin: ");
        String kelime = input.nextLine();

        for (int i = kelime.length() - 1; i >= 0; i--) {
            System.out.println("// "+ kelime.substring(i));
        }
    }
}
