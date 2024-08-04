package _25_Constructor.ornek02;

public class Kitap {

    private final String isim;
    private final String yazar;
    private final int sayfaSayisi;


    // İsim ve yazar bilgileri zorunlu olduğundan, ilk _25_Constructor bunları alır.
    public Kitap(String isim, String yazar) {

        // Eğer isim veya yazar değeri null veya boş bir değer ise "Belirtilmemiş" değeri atanır.
        if (isim == null || isim.trim().isEmpty()) {
            this.isim = "Belirtilmemiş";
        } else {
            this.isim = isim;
        }

        if (yazar == null || yazar.trim().isEmpty()) {
            this.yazar = "Belirtilmemiş";
        } else {
            this.yazar = yazar;
        }

        // Sayfa sayısı verilmezse, varsayılan olarak 0 atanır.
        this.sayfaSayisi = 0;
    }


    // İsim, yazar ve sayfa sayısı bilgileri alınabilir olduğunda,
    // ikinci _25_Constructor bunları alır.
    public Kitap(String isim, String yazar, int sayfaSayisi) {

        // Eğer isim veya yazar değeri null veya boş bir değer ise "Belirtilmemiş" değeri atanır.
        if (isim == null || isim.trim().isEmpty()) {
            this.isim = "Belirtilmemiş";
        } else {
            this.isim = isim;
        }

        if (yazar == null || yazar.trim().isEmpty()) {
            this.yazar = "Belirtilmemiş";
        } else {
            this.yazar = yazar;
        }
        // Sayfa sayısı verilirse, verilen değer atanır
        this.sayfaSayisi = sayfaSayisi;
    }

    // Kitap bilgilerini ekrana yazdırmak için kullanılan metot
    public void bilgileriGoster() {
        System.out.println("isim = " + isim);
        System.out.println("yazar = " + yazar);
        System.out.println("sayfaSayisi = " + sayfaSayisi);
    }

    /**
     Yukarıdaki kodda, Kitap sınıfı oluşturulmuştur.
     Bu sınıf, isim, yazar ve sayfaSayisi özelliklerine sahiptir.
     Bu özellikler private olarak tanımlanmıştır.

     Kitap sınıfının ilk _25_Constructor'ı, isim ve yazar değerlerini alır.
     Eğer isim veya yazar değeri null veya boş bir değer ise, "Belirtilmemiş" değeri atanır.
     Aksi halde, verilen değerler atanır. sayfaSayisi değeri varsayılan olarak 0 olarak atanır.

     İkinci _25_Constructor ise isim, yazar ve sayfaSayisi değerlerini alır.
     Yine, isim veya yazar değeri null veya boş bir değer ise, "Belirtilmemiş" değeri atanır.
     Aksi halde, verilen değerler atanır.

     bilgileriGoster() metodu, kitabın ismini, yazarını ve sayfa sayısını ekrana yazdırmak için kullanılır.
     */
}
