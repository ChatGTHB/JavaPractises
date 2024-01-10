package sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {

        /**
         Soru:
         Bir LinkedHashSet oluşturun ve içine bazı öğrenci isimleri ekleyiniz.
         Daha sonra LinkedHashSet’i yineleyerek öğrenci isimlerini
         eklendikleri sıraya göre yazdırınız.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Bir LinkedHashSet oluşturun
        LinkedHashSet<String> ogrenciler = new LinkedHashSet<>();

        // Kaç öğrenci ekleneceğini kullanıcıdan alın
        System.out.println("Kaç öğrenci eklenecek: ");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine(); // dummy

        // Her öğrenci ismini kullanıcıdan alın ve LinkedHashSet'e ekleyin
        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println(i + ". ogrencinin ismini giriniz: ");
            String isim = scanner.nextLine();
            ogrenciler.add(isim);
        }

        // Bir yineleyici oluşturun ve LinkedHashSet'i yineleyin
        Iterator<String> iterator = ogrenciler.iterator();
        while (iterator.hasNext()) {
            // Her öğrenci ismini yazdırın
            System.out.println(iterator.next());
        }
    }
}
