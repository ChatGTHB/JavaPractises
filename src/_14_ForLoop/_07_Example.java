package _14_ForLoop;

import java.util.Scanner;

public class _07_Example {
    public static void main(String[] args) {
        // Kullanıcıdan alınan metin içerisinde yer alan
        // sesli harflerin sayısını veren Java programını yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz: ");
        String metin = input.nextLine().toLowerCase();
        int sesliSayisi = 0; // sesli harf sayısını tutacak bir sayaç değişkeni tanımlıyoruz
        for (int i = 0; i < metin.length(); i++) { // metnin uzunluğu kadar döngü
            char harf = metin.charAt(i); // metnin i. karakterini alıyoruz
            if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') { // eğer karakter bir sesli harf ise
                sesliSayisi++; // sayaç değişkenini bir artırıyoruz
            }
        }
        System.out.println("Girdiğiniz metindeki sesli harf sayısı: " + sesliSayisi); // sonucu ekrana yazdırıyoruz
    }
}
