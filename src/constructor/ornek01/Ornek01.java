package constructor.ornek01;

public class Ornek01 {
    public static void main(String[] args) {

        // İlk öğrenci nesnesi oluşturuluyor: adı: Ahmet, soyadı: Yılmaz
        Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Yılmaz");
        ogrenci1.bilgileriGoster();

        // İkinci öğrenci nesnesi oluşturuluyor: adı: Ayşe, soyadı: Yıldırım ve yaş: 20
        Ogrenci ogrenci2 = new Ogrenci("Ayşe", "Yıldırım", 20);
        ogrenci2.bilgileriGoster();
    }
}
