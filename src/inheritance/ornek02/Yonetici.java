package inheritance.ornek02;

// Yönetici sınıfı
class Yonetici extends Calisan {
    private String departman;

    // Yönetici sınıfının yapıcı metodu (_25_Constructor)
    public Yonetici(String ad, double maas, String departman) {
        super(ad, maas);
        this.departman = departman;
    }

    // Yönetici sınıfının bilgilerini ekrana yazdıran metodu
    @Override
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Departman: " + departman);
    }
}