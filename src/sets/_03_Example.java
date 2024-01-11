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

        /**
         * Java'da Scanner sınıfını kullanırken, nextInt() gibi bir metoddan sonra
         * nextLine() metoduyla bir satır okumak istediğinizde bazen
         * beklenmeyen bir davranışla karşılaşabilirsiniz.
         * Bu durum, nextInt() gibi bir metotla bir tamsayı okuduktan sonra,
         * klavyeden girilen değeri tam olarak almadan bir sonraki satırı okumaya çalıştığınızda ortaya çıkar.
         *
         * Bu sorun, nextInt() metodu bir tamsayı okuduğunda,
         * kullanıcının girdiği sayıyı alırken satır sonunda kalan
         * yeni satır karakterini (\n) almadığından kaynaklanır.
         * Sonuç olarak, nextLine() metodu bu kalan satırı okur ve hemen bir sonraki satıra geçer.
         *
         * Bu sorunu çözmek için, nextInt() veya diğer tamsayı okuma metodlarından sonra
         * nextLine() metodu çağrılmadan önce bir nextLine() çağrısı daha ekleyebilirsiniz.
         * Bu, nextInt()'dan sonra kalan yeni satır karakterini okuyacak ve bir sonraki satıra geçecektir.
         */
        scanner.nextLine(); // Yeni satır karakterini oku ve atla

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
