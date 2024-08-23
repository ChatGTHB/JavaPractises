package _31_AbstractClass.ornek01;

// Dikdörtgen classı oluşturuldu
public class Dikdortgen extends GeometrikSekil {
// Dikdörtgenin özellikleri eklendi
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    // Abstract method override edilerek dikdörtgenin alanı hesaplandı
    @Override
    public double alanHesapla() {
        return this.uzunluk * this.genislik;
    }
}
