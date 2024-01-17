package staticNonStaticMethods.ornek01;

public class Ornek01 {

    public static void main(String[] args) {

        // İki tane sayı tanımlayalım
        int sayi1 = 10;
        int sayi2 = 5;

        // toplama, çıkarma --> static metot kullanılacak
        int toplam = HesapMakinesi.topla(sayi1, sayi2);
        int fark = HesapMakinesi.fark(sayi1, sayi2);

        // çarpma ve bölme  --> non static method kullanılacak

        // HesapMakinesi sınıfından bir nesne oluşturma
        HesapMakinesi hesapMakinesi=new HesapMakinesi();

        int bolum=hesapMakinesi.bol(sayi1,sayi2);
        int carpim= hesapMakinesi.carp(sayi1,sayi2);

        System.out.println("toplam = " + toplam); // 15
        System.out.println("fark = " + fark);     // 5
        System.out.println("carpim = " + carpim); // 50
        System.out.println("bolum = " + bolum);   // 2
    }
}
