package _27_Enum._06_Example;

/**
 * Drinks enum'u, farklı içecek türlerini temsil eder.
 * Her içeceğin bir adı ve fiyatı vardır.
 * Enum'lar, belirli bir grup sabit değeri temsil eder ve bu değerlerin dışında bir atama yapılmasını engeller.
 */
public enum Drinks {
    COLA("Cola", 1.5),
    SU("Su", 0.5),
    LEMONADE("Limonata", 1.2),
    ICE_TEA("Ice Tea", 1.3),
    FRUIT_JUICE("Meyve Suyu", 1.8);

    // Enum değişkenleri: Sabit (constant) değerlerdir.
    // Bu örnekte, her enum sabiti belirli bir içecek türünü ve ona özgü adı ve fiyatı temsil eder.

    private String ad; // İçeceğin adı. Enum sabitinin bir özelliği olarak tanımlanmıştır.
    private double price; // İçeceğin fiyatı. Enum sabitinin bir özelliği olarak tanımlanmıştır.

    /**
     * Constructor: Her enum sabiti için ad ve fiyat değerlerini atar.
     * Bu constructor, enum sabitleri (COLA, SU, vb.) oluşturulurken çağrılır.
     *
     * @param ad    İçecek adı
     * @param price İçecek fiyatı
     */
    private Drinks(String ad, double price) {
        this.ad = ad;
        this.price = price;
    }

    /**
     * İçecek adını döndüren metot.
     *
     * @return İçeceğin adı
     */
    public String getAd() {
        return ad;
    }

    /**
     * İçecek fiyatını döndüren metot.
     *
     * @return İçeceğin fiyatı
     */
    public double getPrice() {
        return price;
    }
}

/*
Özet:
- Enum sabitleri (COLA, SU, vb.), belirli bir sabit grup değeri temsil eder.
- Bu sabitlerin her birine ad ve fiyat gibi ek bilgiler atanabilir.
- getAd() ve getPrice() metotları, enum sabitlerinin özelliklerini döndürmek için kullanılır.
- Enum'lar, yanlış veri girişini engeller ve kodun daha güvenli olmasını sağlar.
*/
