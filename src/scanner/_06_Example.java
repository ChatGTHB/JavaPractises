package scanner;

import java.util.Scanner;

public class _06_Example {

    public static void main(String[] args) {
        
        /**
         **6. Soru: Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
         KDV tutarını hesaplayıp ekrana bastıran programı yazın.
         (Not : KDV tutarını 18% olarak alın)**
         */


        double girilenTutar, kdvliTutar, kdvTutari;

        Scanner input = new Scanner(System.in);
        System.out.println("%18 KDV'li hali hesaplanacak olan sayıyı giriniz:");
        girilenTutar = input.nextDouble();

        kdvliTutar = girilenTutar * (1.18);
        kdvTutari = girilenTutar * (0.18);

        System.out.println("KDV’siz tutar = " + girilenTutar + "\n" +
                "KDV’li tutar = " + kdvliTutar + "\n" +
                "KDV tutarı = " + kdvTutari);
    }
}

