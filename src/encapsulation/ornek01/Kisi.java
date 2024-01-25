package encapsulation.ornek01;

public class Kisi {
    public String ad; // "ad" özelliği herkese açık olarak tanımlandı
    private int yas; // "yas" özelliği private olarak tanımlandı

    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }
}
