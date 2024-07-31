package _24_StaticNonStaticMethods._01_Example;

public class Main {
    public static void main(String[] args) {
        // İki tane sayı tanımlayalım
        int sayi1 = 10;
        int sayi2 = 5;

        // toplama ve çıkarma işlemleri için static metotları kullanacağız
        int toplam = Calculator.topla(sayi1, sayi2);
        int fark = Calculator.fark(sayi1, sayi2);

        // çarpma ve bölme işlemleri için non-static metotları kullanacağız
        // HesapMakinesi sınıfından bir nesne oluşturma
        Calculator calculator = new Calculator();

        int carpim = calculator.carp(sayi1, sayi2);
        int bolum = calculator.bol(sayi1, sayi2);

        System.out.println("toplam = " + toplam); // 15
        System.out.println("fark = " + fark);     // 5
        System.out.println("carpim = " + carpim); // 50
        System.out.println("bolum = " + bolum);   // 2
    }
}
