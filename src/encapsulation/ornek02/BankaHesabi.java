package encapsulation.ornek02;

import java.util.List;

public class BankaHesabi {

    private final int hesapNumarasi; // Hesap numarasını temsil eden özellik
    private String musteriAdi; // Müşteri adını temsil eden özellik
    private String musteriSoyadi; // Müşteri soyadını temsil eden özellik
    private double hesapBakiyesi; // Hesap bakiyesini temsil eden özellik
    private final List<HesapHareketi> hesapHareketleri; // Hesap hareketlerini temsil eden özellik

    public BankaHesabi(String musteriAdi, String musteriSoyadi, double hesapBakiyesi, int hesapNumarasi, List<HesapHareketi> hesapHareketleri) {
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.hesapBakiyesi = hesapBakiyesi;
        this.hesapNumarasi = hesapNumarasi;
        this.hesapHareketleri = hesapHareketleri; // Hesap hareketleri listesini başlatma
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public int getHesapNumarasi() {
        return hesapNumarasi;
    }

    public List<HesapHareketi> getHesapHareketleri() {
        return hesapHareketleri;
    }

    public void hesapHareketiEkle(String tarih,String aciklama,double miktar,String islemTuru){
        HesapHareketi hareket=new HesapHareketi(tarih,aciklama,miktar,islemTuru);
        hesapHareketleri.add(hareket); // Yeni hesap hareketini listeye ekleme
    }

    @Override
    public String toString() {
        return "BankaHesabi{" +
                "hesapNumarasi=" + hesapNumarasi +
                ", musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", hesapBakiyesi=" + hesapBakiyesi +
                ", hesapHareketleri=" + hesapHareketleri +
                '}';
    }
}
