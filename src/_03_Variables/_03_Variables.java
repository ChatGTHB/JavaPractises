package _03_Variables;

public class _03_Variables {
    public static void main(String[] args) {

        // Task 1:
        // Bir değişken tanımlayın ve değeri 10 olan bu değişkeni 5 ile çarpıp sonucu ekrana yazdırın.

        // Bir tam sayı değişkeni tanımlayın ve değeri 10 olarak atayın.
//        byte byteSayi=10;
//        short shortSayi=10;
        int intSayi=10;
//        long longSayi=10;

        // Değişkeni 5 ile çarpın.
        int sonuc= intSayi*5;

        // Sonucu ekrana yazdırın.
        System.out.println("Sonuç = " + sonuc);

        // Çıktı: Sonuç: 50


//        Task 2:
//        Bir ondalık sayı değişkeni tanımlayın ve değeri 3.14 olan bu değişkenin karesini ekrana yazdırın.

        // Bir ondalık sayı (double) değişkeni tanımlayın ve değeri 3.14 olarak atayın.
        double pi = 3.14;
        // float piFloat=3.14f;

        // Değişkenin karesini hesaplayın.
        double piKare = pi * pi;

        // Karesini ekrana yazdırın.
        System.out.println("piKare = " + piKare);


        //  Task 3:
        // Bir metin değişkeni tanımlayın ve değeri "Java" olan bu metnin uzunluğunu ekrana yazdırın.

        // Bir String değişkeni tanımlayın ve değeri "Java" olarak atayın.
        String kelime="Java";

        // String'in uzunluğunu alın.
        int uzunluk=kelime.length();

        // Uzunluğu ekrana yazdırın.
        System.out.println("uzunluk = " + uzunluk);


//        Task 4:
//        Bir boolean değişkeni tanımlayın ve değeri true olan bu değişkeni tersine çevirip ekrana yazdırın.

        // Bir boolean değişkeni tanımlayın ve değeri true olarak atayın.
        boolean dogruMu = true;

        // Değeri tersine çevirin.
        boolean ters=!dogruMu;

        // Tersine çevrilmiş değeri ekrana yazdırın.
        System.out.println("ters = " + ters);
    }
}
