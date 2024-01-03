package javaSwitch;

import java.util.Scanner;

public class _02_Example {
    public static void main(String[] args) {

        /**
         Soru:
         Kullanıcıdan bir gün adı alınız ve
         bu günün hafta içi mi yoksa hafta sonu mu olduğunu belirten
         bir Java programı yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün adı giriniz: ");
        String gun = input.nextLine().toLowerCase();

        String turu;

        switch (gun.toLowerCase()) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                turu = "hafta içi";
                break;
            case "cumartesi":
            case "pazar":
                turu = "hafta sonu";
                break;
            default:
                turu = "Geçersiz gün adı";
                break;
        }
        System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1) + " " + turu + " dır/dur");
    }
}
