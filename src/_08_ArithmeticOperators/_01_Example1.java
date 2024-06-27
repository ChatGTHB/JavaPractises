package _08_ArithmeticOperators;

public class _01_Example1 {
    public static void main(String[] args) {

        // Java'da aritmetik operatörler, matematiksel hesaplamalarda kullanılan temel işlemleri gerçekleştirmek için kullanılır.
        // İşte Java'da bulunan aritmetik operatörler:

        // Toplama Operatörü (+):
        // İki sayıyı toplamak için kullanılır.

        int sayi1 = 8;
        int sayi2 = 3;
        int toplam = sayi1 + sayi2; // 11
        System.out.println("toplam = " + toplam);

        // Çıkarma Operatörü (-):
        // Bir sayıdan diğerini çıkarmak için kullanılır.


        int fark = sayi1 - sayi2; // 5
        System.out.println("fark = " + fark);

        // Çarpma Operatörü (*):
        // İki sayıyı çarpmak için kullanılır.

        int carpim = sayi1 * sayi2; // 24
        System.out.println("carpim = " + carpim);

        // Bölme Operatörü (/):
        // Bir sayıyı diğerine bölmek için kullanılır.
        // Eğer sayılar tam sayı tipinde ise bölme işlemi tam bölme yapar.

        int bolum = sayi1 / sayi2; // 2
        System.out.println("bolum = " + bolum);

        // Mod (Kalan) Operatörü (%):
        // Bir sayının diğerine bölümünden kalanı bulmak için kullanılır.

        int kalan = sayi1 % sayi2;
        System.out.println("kalan = " + kalan);

        // Artırma Operatörü (++):
        // Bir değişkenin değerini bir artırmak için kullanılır.

        sayi1++; // 9
        System.out.println("sayi1 = " + sayi1);

        // Azaltma Operatörü (--):
        // Bir değişkenin değerini bir azaltmak için kullanılır.

        sayi1--; // 8
        System.out.println("sayi1 = " + sayi1);
    }
}
