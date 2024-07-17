package _19_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _00_JavaArrayListKullanimOrnekleri {
    public static void main(String[] args) {

        // ArrayList Oluşturma:
        // ArrayList, dinamik boyutlu bir dizidir. Java.util.ArrayList'i import ederek kullanabiliriz.
        ArrayList<String> myList = new ArrayList<>();
        System.out.println("Başlangıç myList: " + myList);

        // Eleman Ekleme:
        // add() metodu ile ArrayList'e eleman ekleyebiliriz.
        myList.add("Eleman1");
        myList.add("Eleman2");
        myList.add("Eleman3");
        System.out.println("Eleman eklendikten sonra myList: " + myList);

        // Belirli Bir Indekse Eleman Ekleme:
        // add(index, element) metodu ile belirtilen indekse eleman ekleriz.
        myList.add(1, "YeniEleman"); // "YeniEleman", indeks 1'e eklenir, diğer elemanlar kaydırılır.
        System.out.println("Belirli bir indekse eleman eklendikten sonra myList: " + myList);

        // Elemanları Döngü İle Ekleme:
        // Collections.addAll() metodu ile dizi veya varargs kullanarak birden fazla elemanı ekleyebiliriz.
        String[] dizi = {"Eleman4", "Eleman5", "Eleman6"};
        Collections.addAll(myList, dizi); // Diziyi ekler.
        // veya 2. yöntem
        Collections.addAll(myList, "Eleman7", "Eleman8", "Eleman9"); // Varargs kullanarak eleman ekler.
        System.out.println("Elemanlar döngü ile eklendikten sonra myList: " + myList);

        // Eleman Silme:
        // remove(Object o) metodu ile belirtilen elemanı sileriz.
        myList.remove("Eleman2"); // "Eleman2" elemanını siler.
        System.out.println("Belirli bir eleman silindikten sonra myList: " + myList);

        // Belirli Bir Indeksteki Elemanı Silme:
        // remove(int index) metodu ile belirtilen indeksdeki elemanı sileriz.
        myList.remove(0); // İlk elemanı (indeks 0) siler.
        System.out.println("Belirli bir indeksteki eleman silindikten sonra myList: " + myList);

        // Belirli Bir Elemanın İndeksini Bulma:
        // indexOf(Object o) metodu ile belirtilen elemanın indeksini buluruz.
        int indeks = myList.indexOf("Eleman3"); // "Eleman3" elemanının indeksini bulur.
        System.out.println("Eleman3'ün indeksi: " + indeks);

        // ArrayList Boyutunu Alma:
        // size() metodu ile ArrayList'in boyutunu (eleman sayısını) alırız.
        int boyut = myList.size(); // ArrayList'in boyutunu alır.
        System.out.println("ArrayList'in boyutu: " + boyut);

        // Belirli Bir Indeksteki Elemanı Alma:
        // get(int index) metodu ile belirtilen indeksdeki elemanı alırız.
        String eleman = myList.get(2); // Üçüncü indeksteki elemanı alır.
        System.out.println("Üçüncü indeksteki eleman: " + eleman);

        // Eleman Güncelleme:
        // set(int index, E element) metodu ile belirtilen indeksteki elemanı güncelleriz.
        myList.set(2, "GuncellenmisEleman"); // Üçüncü indeksteki elemanı günceller.
        System.out.println("Eleman güncellendikten sonra myList: " + myList);

        // ArrayList'i Diziye Dönüştürme:
        // toArray(T[] a) metodu ile ArrayList'i diziye dönüştürürüz.
        String[] dizi2 = myList.toArray(new String[0]); // ArrayList'i diziye dönüştürür.
        System.out.print("ArrayList'ten dönüştürülen dizi: ");
        for (String s : dizi2) {
            System.out.print(s + " ");
        }
        System.out.println();

        // ArrayList'i Temizleme:
        // clear() metodu ile ArrayList'in tüm elemanlarını sileriz.
        myList.clear(); // ArrayList'i temizler.
        System.out.println("ArrayList temizlendikten sonra myList: " + myList);

        // isEmpty(): ArrayList boşsa true, doluysa false döner.
        boolean bosMu = myList.isEmpty(); // ArrayList boşsa true, doluysa false döner.
        System.out.println("ArrayList boş mu: " + bosMu);

        // contains(Object o): Belirtilen elemanın ArrayList içinde olup olmadığını kontrol eder.
        boolean varMi = myList.contains("Eleman1"); // "Eleman1" elemanı ArrayList'te varsa true döner.
        System.out.println("Eleman1 ArrayList'te var mı: " + varMi);

        // addAll(Collection c): Başka bir koleksiyondaki tüm elemanları mevcut ArrayList'e ekler.
        ArrayList<String> digerListe = new ArrayList<>();
        digerListe.add("EkEleman1");
        digerListe.add("EkEleman2");
        myList.addAll(digerListe); // digerListe'deki tüm elemanları myList'e ekler.
        System.out.println("Başka bir koleksiyondan eklenen elemanlardan sonra myList: " + myList);

        // removeAll(Collection c): Belirtilen koleksiyondaki tüm elemanları ArrayList'den kaldırır.
        myList.removeAll(digerListe); // digerListe'deki tüm elemanları myList'ten çıkarır.
        System.out.println("Başka bir koleksiyondaki elemanlar çıkarıldıktan sonra myList: " + myList);

        // retainAll(Collection c): Belirtilen koleksiyondaki elemanlar dışındaki tüm elemanları kaldırır.
        myList.addAll(digerListe); // Yeniden ekleyelim ki retainAll'ı test edelim.
        myList.retainAll(digerListe); // myList'te sadece digerListe'deki elemanları bırakır, diğerlerini çıkarır.
        System.out.println("Belirtilen koleksiyon dışındaki elemanlar çıkarıldıktan sonra myList: " + myList);

        // add() metodu ile ArrayList'e eleman ekleyebiliriz.
        myList.add("Eleman11");
        myList.add("Eleman12");
        myList.add("Eleman13");
        System.out.println("Yeni elemanlar eklendikten sonra myList: " + myList);

        // subList(int fromIndex, int toIndex): Belirtilen indeks aralığındaki elemanları içeren alt bir List döner.
        List<String> altListe = myList.subList(1, 3); // 1. ve 2. indeksdeki elemanları içeren bir alt liste döner.
        System.out.println("altListe = " + altListe);

        // Collections.sort(): ArrayList'i sıralar.
        Collections.sort(myList);
        System.out.println("Sıralı myList: " + myList);

        // Collections.reverse(): ArrayList'in sıralamasını tersine çevirir.
        Collections.reverse(myList);
        System.out.println("Ters sıralı myList: " + myList);
    }
}
