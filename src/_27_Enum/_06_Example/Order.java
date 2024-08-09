package _27_Enum._06_Example;

import java.util.HashMap;
import java.util.Map;

/**
 * Order sınıfı, kullanıcıdan alınan içecek siparişlerini ve bu siparişlerin adetlerini yönetir.
 * Bu sınıfta kullanılan değişkenler, sınıf seviyesindedir ve siparişlerin saklanması için kullanılır.
 */
public class Order {
    // Class değişkeni: Bu sınıfın her bir örneği için ayrı ayrı oluşturulan veri yapısını (HashMap)
    // temsil eder.
    // Bu veri yapısı, sipariş edilen içeceklerin türlerini ve adetlerini saklar.

    private Map<Drinks, Integer> orderDetails;

    /**
     * Constructor: Sipariş detaylarını saklayacak olan HashMap'i başlatır.
     * Her Order nesnesi, kendi sipariş detaylarına sahip olur.
     */
    public Order() {
        orderDetails = new HashMap<>();
    }

    /**
     * Kullanıcının seçtiği içecek ve adet bilgisini siparişe ekler.
     *
     * @param drink Sipariş edilen içecek türü (enum sabiti)
     * @param pcs   Sipariş edilen adet
     */
    public void addOrder(Drinks drink, int pcs) {
        // HashMap içinde her bir enum sabiti ve ona karşılık gelen adet saklanır.
        orderDetails.put(drink, pcs);
    }

    /**
     * Sipariş detaylarını ekrana yazdırır.
     * Her içeceğin adı, adedi, birim fiyatı ve toplam fiyatı gösterilir.
     * Ayrıca, genel toplam fiyat da hesaplanır ve gösterilir.
     */
    public void showOrderDetails() {
        System.out.println("Sipariş Detayı:");
        double total = 0.0; // Toplam tutarı hesaplamak için class değişkeni olarak kullanılır.

        // HashMap'in her bir girdisi için içecek adı, adet ve fiyat bilgilerini yazdırır.
        for (Map.Entry<Drinks, Integer> entry : orderDetails.entrySet()) {
            Drinks drink = entry.getKey(); // Enum sabiti (Drinks), içecek türünü temsil eder.
            int pcs = entry.getValue(); // Class değişkeni (Integer), sipariş edilen adet miktarını tutar.
            double cost = drink.getPrice() * pcs; // Her içeceğin toplam maliyeti hesaplanır.
            total += cost; // Genel toplam maliyete eklenir.

            System.out.println("İçecek: " + drink.getAd());
            System.out.println("Adet: " + pcs);
            System.out.println("Birim Fiyat: " + drink.getPrice() + " TL");
            System.out.println("Toplam Fiyat: " + cost + " TL");
            System.out.println("-------------------------");
        }

        System.out.println("Genel Toplam: " + total + " TL"); // Genel toplam fiyat yazdırılır.
    }
}

/*
Özet:
- orderDetails, bir HashMap olarak, sipariş edilen içecek türlerini ve bunların adetlerini saklar.
- Enum sabitleri (örneğin, Drinks.COLA), içecek türlerini güvenli ve hatasız bir şekilde temsil eder.
- Class değişkenleri (örneğin, int pcs), belirli bir sipariş nesnesine özgü olan verilerdir.
- Bu sınıf, siparişlerin eklenmesi ve detaylarının yazdırılması gibi işlemleri yönetir.
*/
