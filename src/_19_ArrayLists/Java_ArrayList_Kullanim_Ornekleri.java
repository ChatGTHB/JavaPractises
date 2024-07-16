package _19_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_ArrayList_Kullanim_Ornekleri {
    public static void main(String[] args) {

        // ArrayList Oluşturma:
        // ArrayList, dinamik boyutlu bir dizidir. Java.util.ArrayList'i import ederek kullanabiliriz.
        ArrayList<String> myList = new ArrayList<>();

        // Eleman Ekleme:
        // add() metodu ile ArrayList'e eleman ekleyebiliriz.
        myList.add("Eleman1");
        myList.add("Eleman2");
        myList.add("Eleman3");

        // Belirli Bir Indekse Eleman Ekleme:
        // add(index, element) metodu ile belirtilen indekse eleman ekleriz.
        myList.add(1, "YeniEleman"); // "YeniEleman", indeks 1'e eklenir, diğer elemanlar kaydırılır.

        // Elemanları Döngü İle Ekleme:
        // Collections.addAll() metodu ile dizi veya varargs kullanarak birden fazla elemanı ekleyebiliriz.
        String[] dizi = {"Eleman4", "Eleman5", "Eleman6"};
        Collections.addAll(myList, dizi); // Diziyi ekler.
        // veya 2. yöntem
        Collections.addAll(myList, "Eleman4", "Eleman5", "Eleman6"); // Varargs kullanarak eleman ekler.

        // Eleman Silme:
        // remove(Object o) metodu ile belirtilen elemanı sileriz.
        myList.remove("Eleman2"); // "Eleman2" elemanını siler.

        // Belirli Bir Indeksteki Elemanı Silme:
        // remove(int index) metodu ile belirtilen indeksdeki elemanı sileriz.
        myList.remove(0); // İlk elemanı (indeks 0) siler.

        // Belirli Bir Elemanın İndeksini Bulma:
        // indexOf(Object o) metodu ile belirtilen elemanın indeksini buluruz.
        int indeks = myList.indexOf("Eleman3"); // "Eleman3" elemanının indeksini bulur.

        // ArrayList Boyutunu Alma:
        // size() metodu ile ArrayList'in boyutunu (eleman sayısını) alırız.
        int boyut = myList.size(); // ArrayList'in boyutunu alır.

        // Belirli Bir Indeksteki Elemanı Alma:
        // get(int index) metodu ile belirtilen indeksdeki elemanı alırız.
        String eleman = myList.get(2); // İkinci indeksdeki elemanı alır.

        // ArrayList'i Diziye Dönüştürme:
        // toArray(T[] a) metodu ile ArrayList'i diziye dönüştürürüz.
        String[] dizi2 = myList.toArray(new String[0]); // ArrayList'i diziye dönüştürür.

        // ArrayList'i Temizleme:
        // clear() metodu ile ArrayList'in tüm elemanlarını sileriz.
        myList.clear(); // ArrayList'i temizler.

        // isEmpty(): ArrayList boşsa true, doluysa false döner.
        boolean bosMu = myList.isEmpty(); // ArrayList boşsa true, doluysa false döner.

        // contains(Object o): Belirtilen elemanın ArrayList içinde olup olmadığını kontrol eder.
        boolean varMi = myList.contains("Eleman1"); // "Eleman1" elemanı ArrayList'te varsa true döner.

        // addAll(Collection c): Başka bir koleksiyondaki tüm elemanları mevcut ArrayList'e ekler.
        ArrayList<String> digerListe = new ArrayList<>();
        digerListe.add("EkEleman1");
        digerListe.add("EkEleman2");
        myList.addAll(digerListe); // digerListe'deki tüm elemanları myList'e ekler.

        // removeAll(Collection c): Belirtilen koleksiyondaki tüm elemanları ArrayList'den kaldırır.
        myList.removeAll(digerListe); // digerListe'deki tüm elemanları myList'ten çıkarır.

        // retainAll(Collection c): Belirtilen koleksiyondaki elemanlar dışındaki tüm elemanları kaldırır.
        myList.retainAll(digerListe); // myList'te sadece digerListe'deki elemanları bırakır, diğerlerini çıkarır.

        // subList(int fromIndex, int toIndex): Belirtilen indeks aralığındaki elemanları içeren alt bir List döner.
        List<String> altListe = myList.subList(1, 3); // 1. ve 2. indeksdeki elemanları içeren bir alt liste döner.
    }
}
