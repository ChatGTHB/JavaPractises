package _24_StaticNonStaticMethods._02_Example;

public class Dikdortgen {

    public double alanHesapla(double uzunluk, double genislik) {
        return uzunluk * genislik;
    }

    public static double cevreHesapla(double uzunluk, double genislik){
        return (uzunluk+genislik) * 2;
    }
}
