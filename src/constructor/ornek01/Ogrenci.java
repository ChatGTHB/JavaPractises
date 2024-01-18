package constructor.ornek01;

public class Ogrenci {

    //    Bir Ogrenci sınıfı oluşturmanız isteniyor.
//    Bu sınıfın özellikleri ad, soyad ve yas olmalıdır.
    private final String ad;

    private final String soyad;

    private final int yas;

    // Constructor 1: ad ve soyad ve yaş alarak öğrenci oluşturma
    public Ogrenci(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    // Constructor 2: ad ve soyad alarak öğrenci oluşturma
    // Ayrıca, yas değeri verilmezse varsayılan olarak 18 olarak atanmalıdır.
    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = 18; // Varsayılan olarak yaş 18 olarak atanıyor
    }

    //    bilgileriGoster() metodu : Öğrenci bilgilerini ekrana yazdırma

    public void bilgileriGoster() {
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
    }

    /**
     Yukarıdaki kodda, Ogrenci sınıfı oluşturulmuştur.
     ad, soyad ve yas özellikleri private olarak tanımlanmıştır.
     İlk constructor, ad, soyad ve yas değerlerini alarak bir öğrenci nesnesi oluşturur.
     İkinci constructor ise ad ve soyad değerlerini alarak bir öğrenci nesnesi oluşturur ve
     yaş değerini varsayılan olarak 18 olarak atar.
     bilgileriGoster() metodu, öğrencinin adını, soyadını ve yaşını ekrana yazdırır.
     */

}
