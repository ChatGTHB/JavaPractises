package _24_StaticNonStaticMethods._03_Example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Kitapları tutan bir liste
    private List<Book> books = new ArrayList<>();

    // Toplam kitap sayısını tutan statik değişken
    private static int totalBookCount = 0;

    // Kütüphaneye kitap ekleyen non-static metot
    public void addBook(Book book) {
        books.add(book); // Listeye kitap ekle
        totalBookCount++; // Toplam kitap sayısını artır
    }

    // Kütüphaneden kitap çıkaran non-static metot
    public void removeBook(Book book) {
        books.remove(book); // Listeden kitap çıkar
        totalBookCount--; // Toplam kitap sayısını azalt
    }

    // Toplam kitap sayısını döndüren static metot
    public static int getTotalBookCount() {
        return totalBookCount;
    }
}
