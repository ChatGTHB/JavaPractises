package generalReview.ornek01;

import java.util.Scanner;

public class Ornek01 {

    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Üç farklı tam sayı giriniz: ");

        System.out.print("Birinci sayı (a): ");
        a = input.nextInt();

        System.out.print("İkinci sayı (b): ");
        b = input.nextInt();

        System.out.print("Üçüncü sayı (c): ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("c<a<b");
            } else {
                System.out.println("c<b<a");
            }
        } else {
            System.out.println("Hatalı giriş yaptınız. Lütfen farklı sayılar giriniz.");
        }
    }
}
