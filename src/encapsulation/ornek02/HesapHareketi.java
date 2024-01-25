package encapsulation.ornek02;

public class HesapHareketi {

    private final String  tarih;    // Hesap hareketinin gerçekleştiği tarih

    private final String aciklama;  // Hesap hareketinin açıklaması

    private final double miktar;    // Hesap hareketindeki miktar

    private final String islemTuru; // Hesap hareketindeki işlem türü


    public HesapHareketi(String tarih, String aciklama, double miktar, String islemTuru) {
        this.tarih=tarih;
        this.aciklama=aciklama;
        this.miktar=miktar;
        this.islemTuru=islemTuru;
    }

    public String getTarih() {
        return tarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public double getMiktar() {
        return miktar;
    }

    public String getIslemTuru() {
        return islemTuru;
    }

    @Override
    public String toString() {
        return "HesapHareketi{" +
                "tarih='" + tarih + '\'' +
                ", aciklama='" + aciklama + '\'' +
                ", miktar=" + miktar +
                ", islemTuru='" + islemTuru + '\'' +
                '}';
    }
}
