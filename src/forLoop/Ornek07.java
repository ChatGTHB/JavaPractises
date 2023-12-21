package forLoop;

import java.util.Scanner;

public class Ornek07 {

    public static void main(String[] args) {

        // Kullanıcıdan alınan metin içerisinde yer alan
        // sesli harflerin sayısını veren Java programını yazınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz: ");
        String metin = input.nextLine().toLowerCase();

        int sesliSayisi = 0;
          // araba
        for (int i = 0; i < metin.length(); i++) {
            char harf = metin.charAt(i);
            if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'ı'
                    || harf == 'u' || harf == 'ü' || harf == 'o' || harf == 'ö'){
                sesliSayisi++;
            }
        }
        System.out.println("Girdiğiniz metindeki sesli harf sayısı= "+ sesliSayisi);
    }
}
