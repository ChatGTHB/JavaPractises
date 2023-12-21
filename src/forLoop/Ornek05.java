package forLoop;


import java.util.Scanner;

public class Ornek05 {
    public static void main(String[] args) {

        // Kullanıcıdan alınan sayının faktöriyelini veren Java programı yazınız.

        // Faktöriyel, pozitif bir tam sayının kendisi ile 1 arasındaki tüm tam sayılarla çarpımıdır.
        // Örneğin, 5 faktöriyel (5!) 5 x 4 x 3 x 2 x 1 = 120 olarak hesaplanır.
        // 4!= 4*3*2*1                1 x 2 x 3 x 4 x 5
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayı giriniz: ");
        int sayi = input.nextInt();

        int faktöriyel = 1;


        // 1. method
//        for (int i = 1; i <= sayi; i++) {
//            faktöriyel = faktöriyel * i;
//            // faktöriyel *= i;
//        }

        // 2. method
        for (int i = sayi; i >= 1; i--) {
            faktöriyel = faktöriyel * i;
            // faktöriyel *= i;
        }
        System.out.println(sayi + " sayısının faktöriyeli= " + faktöriyel);
    }
}
