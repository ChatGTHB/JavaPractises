package _27_Enum._06_Example;

import java.util.HashMap;
import java.util.Map;

/**
 * BeverageOrder sınıfı, bir içecek siparişini temsil eder ve sipariş detaylarını saklar.
 */
public class BeverageOrder {
    // İçecek türü ve sipariş adedini saklayan veri yapısı
    private Map<BeverageType, Integer> orderDetails;

    /**
     * Constructor: Yeni bir sipariş nesnesi oluşturur.
     */
    public BeverageOrder() {
        orderDetails = new HashMap<>();
    }

    /**
     * Siparişe yeni bir içecek ve adet bilgisi ekler.
     *
     * @param beverage İçecek türü
     * @param pcs      Sipariş edilen adet
     */
    public void addOrder(BeverageType beverage, int pcs) {
        orderDetails.put(beverage, pcs);
    }

    /**
     * Sipariş detaylarını ekrana yazdırır.
     * Her içeceğin adı, adedi, birim fiyatı ve toplam fiyatı gösterilir.
     */
    public void showOrderDetails() {
        System.out.println("Sipariş Detayı:");
        double total = 0.0;

        for (Map.Entry<BeverageType, Integer> entry : orderDetails.entrySet()) {
            BeverageType beverage = entry.getKey();
            int pcs = entry.getValue();
            double cost = beverage.getPrice() * pcs;
            total += cost;

            System.out.println("İçecek: " + beverage.getName());
            System.out.println("Adet: " + pcs);
            System.out.println("Birim Fiyat: " + beverage.getPrice() + " TL");
            System.out.println("Toplam Fiyat: " + cost + " TL");
            System.out.println("-------------------------");
        }

        System.out.println("Genel Toplam: " + total + " TL");
    }
}
