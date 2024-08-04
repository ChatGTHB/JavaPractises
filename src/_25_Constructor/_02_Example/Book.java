package _25_Constructor._02_Example;

public class Book {
    // Özellikler (Attributes)
    String name; // Kitabın ismi
    String author;  // Kitabın yazarı
    int pageCount;  // Kitabın sayfa sayısı

    // pageCount parametresi olmadan constructor - sayfa sayısı varsayılan olarak 0 atanır
    public Book(String name, String author) {
        // Constructor'a geçirilen isim ve yazar parametreleri sınıfın özelliklerine atanır
        if (name == null || name.isEmpty()) {
            // Eğer isim boş veya null ise, "Bilinmiyor" atanır
            this.name = "Bilinmiyor";
        } else {
            this.name = name;
        }

        if (author == null || author.isEmpty()) {
            // Eğer yazar boş veya null ise, "Bilinmiyor" atanır
            this.author = "Bilinmiyor";
        } else {
            this.author = author;
        }

        this.pageCount = 0; // Sayfa sayısı için varsayılan değer atanır
    }

    // pageCount parametresi ile constructor
    public Book(String name, String author, int pageCount) {
        // Constructor'a geçirilen isim, yazar ve sayfa sayısı parametreleri sınıfın özelliklerine atanır
        if (name == null || name.isEmpty()) {
            // Eğer isim boş veya null ise, "Bilinmiyor" atanır
            this.name = "Bilinmiyor";
        } else {
            this.name = name;
        }

        if (author == null || author.isEmpty()) {
            // Eğer yazar boş veya null ise, "Bilinmiyor" atanır
            this.author = "Bilinmiyor";
        } else {
            this.author = author;
        }

        this.pageCount = pageCount;
    }

    // Kitabın bilgilerini ekrana yazdıran metod
    public void displayInfo() {
        // Kitabın ismi ekrana yazdırılır
        System.out.println("Kitap İsmi: " + this.name);
        // Kitabın yazarı ekrana yazdırılır
        System.out.println("Yazar: " + this.author);
        // Kitabın sayfa sayısı ekrana yazdırılır
        System.out.println("Sayfa Sayısı: " + this.pageCount);
    }
}
