package staticNonStaticMethods.ornek02;

public class Ornek02 {

    public static void main(String[] args) {

        Dikdortgen dikdortgen=new Dikdortgen();

        double uzunluk=5;
        double genislik=3;

        double alan= dikdortgen.alanHesapla(uzunluk,genislik); // 15
        System.out.println("alan = " + alan);

        double cevre=Dikdortgen.cevreHesapla(uzunluk,genislik); // 16
        System.out.println("cevre = " + cevre);
    }
}
