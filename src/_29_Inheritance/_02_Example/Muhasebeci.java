package _29_Inheritance._02_Example;

// Muhasebeci sınıfı

class Muhasebeci extends Calisan {

    // Muhasebeci sınıfının yapıcı metodu (_25_Constructor)
    public Muhasebeci(String ad, double maas) {
        super(ad, maas);
    }

    // Muhasebeci sınıfının maaş hesaplama metodu
    public void maasHesapla() {
        // Maaş hesaplama işlemleri
        double maas = super.getMaas();  // Üst sınıfın getMaas() metodu ile maas özelliğine erişim
        double vergi = maas * 0.20;
        double netMaas = maas - vergi;

        System.out.println("Net Maaş: " + netMaas);
    }
}
