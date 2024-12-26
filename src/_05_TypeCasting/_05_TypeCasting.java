package _05_TypeCasting;

public class _05_TypeCasting {
    public static void main(String[] args) {

        // Task 1:
        // Bir ondalık sayı (double) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.

        // 🔢 Bir ondalık sayı (double) tanımlıyoruz.
        double ondalikSayi = 7.48;
        System.out.println("Ondalık Sayı (double) = " + ondalikSayi);

        // 🧑‍🎓 double değeri int tipine dönüştürüyoruz (kesir kısmı atılır).
        int tamSayi = (int) ondalikSayi;

        // 📟 Dönüştürülen tam sayıyı ekrana yazdırıyoruz.
        System.out.println("Tam Sayı (int) = " + tamSayi);


        // Task 2:
        // Bir tam sayı (int) tanımlayın ve bu değeri ondalık sayı (double) veri tipine dönüştürüp ekrana yazdırın.

        // 🔢 Bir tam sayı (int) tanımlıyoruz.
        int tamSayi2 = 748;
        System.out.println("Tam Sayı (int) = " + tamSayi2);

        // 🔄 int değeri otomatik olarak double tipine dönüştürülür (genişletme).
        double ondalikSayi2 = tamSayi2;

        // 📟 Dönüştürülen ondalık sayıyı ekrana yazdırıyoruz.
        System.out.println("Ondalık Sayı (double) = " + ondalikSayi2);


        // Task 3:
        // Bir ondalık sayı (float) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.

        // 🔢 Bir ondalık sayı (float) tanımlıyoruz (f eklenerek float belirlenir).
        float floatSayi = 1.2F;
        System.out.println("Ondalık Sayı (float) = " + floatSayi);

        // 🧑‍🎓 float değeri int tipine dönüştürülüyor (kesir kısmı atılır).
        int intSayi3 = (int) floatSayi;

        // 📟 Dönüştürülen tam sayıyı ekrana yazdırıyoruz.
        System.out.println("Tam Sayı (int) = " + intSayi3);


        // Task 4:
        // Bir metin (String) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.

        // 📝 Bir metin (String) tanımlıyoruz (sayı formatında olmalı).
        String sayiStr = "123";
        System.out.println("String Sayı = " + sayiStr);

        // 🧑‍🎓 String değeri int tipine dönüştürülüyor (parseInt kullanılır).
        int intSayi4 = Integer.parseInt(sayiStr);

        // 📟 Dönüştürülen tam sayıyı ekrana yazdırıyoruz.
        System.out.println("Tam Sayı (int) = " + intSayi4);
    }
}