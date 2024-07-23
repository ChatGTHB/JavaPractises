package _05_TypeCasting;

public class _05_TypeCasting {
    public static void main(String[] args) {

//        Soru 1:
//        Bir ondalık sayı (double) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.

        // Bir ondalık sayı (double) tanımlayın.
        double ondalikSayi = 7.48;
        System.out.println("ondalikSayi = " + ondalikSayi);

        // double değeri int tipine dönüştürün.
        int tamSayi= (int) ondalikSayi;

        // Dönüştürülen değeri ekrana yazdırın.
        System.out.println("tamSayi = " + tamSayi);


//        Soru 2:
//        Bir tam sayı (int) tanımlayın ve bu değeri ondalık sayı (double) veri tipine dönüştürüp ekrana yazdırın.

        // Bir tam sayı (int) tanımlayın.
        int tamSayi2 = 748;
        System.out.println("tamSayi2 = " + tamSayi2);

        // int değeri double tipine dönüştürün.
        double ondalikSayi2 = tamSayi2;

        // Dönüştürülen değeri ekrana yazdırın.
        System.out.println("ondalikSayi2 = " + ondalikSayi2);


//        Soru 3:
//        Bir ondalık sayı (float) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.

        // Bir ondalık sayı (float) tanımlayın
        float floatSayi = 1.2F;
        System.out.println("floatSayi = " + floatSayi);

        // ondalık sayı değerini tam sayı tiine dönüştürün
        int intSayi3 = (int) floatSayi;

        // Dönüştürülen değeri ekrana yazdırın.
        System.out.println("intSayi3 = " + intSayi3);


//        Soru 4:
//        Bir metin (String) tanımlayın ve bu değeri tam sayı (int) veri tipine dönüştürüp ekrana yazdırın.


        // Bir metin (String) tanımlayın.
            String sayiStr="123";

        // String değeri int tipine dönüştürün.
            int intSayi4= Integer.parseInt(sayiStr);

        // Dönüştürülen değeri ekrana yazdırın.
        System.out.println("intSayi4 = " + intSayi4);
    }
}
