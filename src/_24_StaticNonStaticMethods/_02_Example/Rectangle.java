package _24_StaticNonStaticMethods._02_Example;

public class Rectangle {
    // İki sayıyı çarpan non-static bir metot
    public double alanHesapla(double uzunluk, double genislik) {
        return uzunluk * genislik;
    }

    // İki sayıyı toplayıp iki ile çarpan static bir metot
    public static double cevreHesapla(double uzunluk, double genislik) {
        return (uzunluk + genislik) * 2;
    }
}
