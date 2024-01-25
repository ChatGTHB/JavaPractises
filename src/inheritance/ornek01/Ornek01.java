package inheritance.ornek01;

public class Ornek01 {
    public static void main(String[] args) {

        // Kedi nesnesi oluşturma
        Kedi kedi = new Kedi("mavi", 2);

        // Köpek nesnesi oluşturma
        Kopek kopek = new Kopek("beyaz", 2, "kırmızı");

        // Kedi bilgilerini ekrana yazdırma
        System.out.println("Kedi: ");
        System.out.println("Renk: " + kedi.renk);
        System.out.println("Yaş: " + kedi.yas);

        // Kedi miyavlasın
        System.out.println("Ses: ");
        kedi.miyavla();

        // Köpek bilgilerini yazdırma
        System.out.println("Köpek: ");
        System.out.println("Renk: " + kopek.renk);
        System.out.println("Yas: " + kopek.yas);
        System.out.println("Tasma: " + kopek.tasma);

        // Köpek havlasın
        kopek.havla();
    }
}
