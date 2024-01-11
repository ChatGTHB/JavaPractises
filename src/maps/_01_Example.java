package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_Example {
    public static void main(String[] args) {

        /**
         * Talep: Restoran uygulaması geliştirme
         * Restoran, kullanıcıların menüden sipariş verebileceği bir uygulama geliştirmek istiyor.
         * Aşağıdaki gereksinimlere uygun bir Java programı yazmanız gerekmektedir:
         * <p>
         * 1- Restoranın menüsü, yemek adları ve fiyatlarından oluşan bir HashMap veri yapısı kullanılarak tanımlanmalıdır.
         * 2- Kullanıcıya menüdeki yemekleri ve fiyatlarını gösteren bir liste sunulmalıdır.
         * 3- Kullanıcı, sipariş listesini girmek için programdan bir giriş istemelidir. Siparişler virgülle
         ayrılmış olarak girilmelidir.
         * 4- Program, kullanıcının girdiği siparişlerin toplam fiyatını hesaplamalı ve ekrana yazdırmalıdır.
         * 5- Program, kullanıcının girdiği siparişlerin indirim tutarını hesaplamalı ve ekrana yazdırmalıdır.
         İndirimler, özel tekliflerin bulunduğu bir HashMap veri yapısı kullanılarak tanımlanmalıdır.
         * 6- Program, toplam tutarı hesaplayarak ekrana yazdırmalıdır (toplam fiyat - indirim tutarı).
         * 7- Kullanıcının girdiği sipariş listesini ekrana yazdırmalıdır.
         * İstenen özelliklere sahip bir Java programı geliştirerek, restoranın taleplerini karşılayabilirsiniz.
         */


        // 1- Restoranın menüsü, yemek adları ve fiyatlarından oluşan bir HashMap veri yapısı kullanılarak tanımlanmalıdır.

        HashMap<String, Double> menu = new HashMap<>();

        menu.put("Köfte", 25.99);
        menu.put("Kebap", 35.99);
        menu.put("Pilav", 12.99);
        menu.put("Salata", 8.99);
        menu.put("Tatlı", 15.99);

        // 2- Kullanıcıya menüdeki yemekleri ve fiyatlarını gösteren bir liste sunulmalıdır.

        System.out.println("***** İSTANBUL KEBAP EVİ *****");
        System.out.println("*****     HOŞGELDİNİZ    *****\n");
        System.out.println("Menü: ");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 3- Kullanıcı, sipariş listesini girmek için programdan bir giriş istemelidir.
        // Siparişler virgülle ayrılmış olarak girilmelidir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSiparişlerinizi giriniz (virgülle ayırarak giriniz): ");
        String siparisListesi = scanner.nextLine();
        // System.out.println("siparisListesi = " + siparisListesi);
        String[] siparisler = siparisListesi.split(",");

        // 4- Program, kullanıcının girdiği siparişlerin toplam fiyatını hesaplamalı ve ekrana yazdırmalıdır.

        double toplamFiyat = hesaplaToplamFiyat(menu, siparisler);
        System.out.println("\nToplam Fiyat:  " + toplamFiyat);

        // 5- Program, kullanıcının girdiği siparişlerin indirim tutarını hesaplamalı ve ekrana yazdırmalıdır.
        // İndirimler, özel tekliflerin bulunduğu bir HashMap veri yapısı kullanılarak tanımlanmalıdır.

        // Özel teklifleri ekle
        HashMap<String, Double> ozelTeklifler = new HashMap<>();
        ozelTeklifler.put("Kebap", 0.2); // Kebap için %20 indirim
        ozelTeklifler.put("Tatlı", 0.1); // Tatlı için %10 indirim

        // İndirim tutarını hesapla
        double indirimTutari = hesaplaIndirimTutari(menu, ozelTeklifler, siparisler);
        System.out.println("İndirim Tutari: "+indirimTutari);

        // 6- Program, toplam tutarı hesaplayarak ekrana yazdırmalıdır (toplam fiyat - indirim tutarı).
        // Toplam tutarı hesaplama
        double toplamTutar=toplamFiyat-indirimTutari;
        System.out.println("Toplam Tutar: "+toplamTutar);

         // 7- Kullanıcının girdiği sipariş listesini ekrana yazdırmalıdır.

        System.out.println("\nSiparişleriniz:");

        for(String siparis:siparisler){
            System.out.println(siparis);
        }

        System.out.println("\n*****               Afiyet Olsun!                 *****");
        System.out.println("***** Bizi Tercih Ettiğiniz için Teşekkür Ederiz! *****");
    }

    public static double hesaplaIndirimTutari(HashMap<String, Double> menu, HashMap<String, Double> ozelTeklifler, String[] siparisler) {
        double indirimTutari = 0.0;

        for (String siparis : siparisler) {
            if (menu.containsKey(siparis) && ozelTeklifler.containsKey(siparis)) {
                double fiyat = menu.get(siparis);
                double indirimOrani = ozelTeklifler.get(siparis);
                double indirimMiktari = fiyat * indirimOrani;
                indirimTutari += indirimMiktari; //indirimTutari=indirimTutari+indirimMiktari;
            }
        }
        return indirimTutari;
    }

    public static double hesaplaToplamFiyat(Map<String, Double> menu, String[] siparisler) {
        double toplam = 0.0;

        for (String siparis : siparisler) {
            if (menu.containsKey(siparis)) {
                toplam = toplam + menu.get(siparis);
            }
        }
        return toplam;
    }
}
