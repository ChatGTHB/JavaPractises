package _25_Constructor._02_Example;

public class TestBook {
    public static void main(String[] args) {
        // Varsayılan sayfa sayısı ile bir kitap nesnesi oluşturma
        // "Kürk Mantolu Madonna" isimli bir kitap nesnesi oluşturulur ve sayfa sayısı belirtilmediği için 0 atanır
        Book book1 = new Book("Kürk Mantolu Madonna", "Sabahattin Ali");
        // Oluşturulan kitap nesnesinin bilgilerini ekrana yazdırma
        book1.displayInfo();

        // Kitaplar arasında boş bir satır eklemek için
        System.out.println(); // Boş satır

        // Belirtilen sayfa sayısı ile bir kitap nesnesi oluşturma
        // "Saatleri Ayarlama Enstitüsü" isimli bir kitap nesnesi oluşturulur ve sayfa sayısı 382 olarak atanır
        Book book2 = new Book("Saatleri Ayarlama Enstitüsü", "Ahmet Hamdi Tanpınar", 382);
        // Oluşturulan kitap nesnesinin bilgilerini ekrana yazdırma
        book2.displayInfo();
    }
}
