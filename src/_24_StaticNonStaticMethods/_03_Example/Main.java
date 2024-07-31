package _24_StaticNonStaticMethods._03_Example;

public class Main {
    public static void main(String[] args) {
        // Library sınıfından bir nesne oluşturma
        Library library = new Library();

        // Book sınıfından bir nesne oluşturma ve değer atama
        Book book1 = new Book();
        book1.title = "1984";
        book1.author = "George Orwell";

        // Bir başka Book nesnesi oluşturma ve değer atama
        Book book2 = new Book();
        book2.title = "To Kill a Mockingbird";
        book2.author = "Harper Lee";

        // Kütüphaneye kitap ekleme
        library.addBook(book1);
        library.addBook(book2);

        // Toplam kitap sayısını yazdırma
        System.out.println("Toplam kitap sayısı: " + Library.getTotalBookCount()); // 2

        // Kütüphaneden kitap çıkarma
        library.removeBook(book1);

        // Toplam kitap sayısını tekrar yazdırma
        System.out.println("Toplam kitap sayısı: " + Library.getTotalBookCount()); // 1
    }
}

