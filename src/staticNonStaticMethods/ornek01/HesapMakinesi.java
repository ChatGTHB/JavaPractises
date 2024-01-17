package staticNonStaticMethods.ornek01;

public class HesapMakinesi {

    // İki sayıyı toplayan statik bir mtot oluşturalım
    public static int topla(int number1, int number2) {
        // int toplam= sayi1+sayi2;
        return number1 + number2;
    }

    // İki sayıyı çıkaran statik bir metot
    public static int fark(int number1, int number2) {
        int fark = number1 - number2;
        return fark;
    }

    // İki sayıyı çarpan non-statik bir metot
    public int carp(int number1, int number2) {
        return number1 * number2;
    }

    // İki sayıyı bölen non-statik bir metot
    public int bol(int number1,int number2){
        return number1/number2;
    }
}
