package encapsulation.ornek02;

public class Ornek02 {
    public static void main(String[] args) {

        // Banka Hesabı nesnesi oluşturuldu
        BankaHesabi bankaHesabi= new BankaHesabi("Ahmet","Yılmaz",123456,5000);

        // Hesap hareketi ekleme
        bankaHesabi.hesapHareketiEkle("25.01.2024","EFT", 1000,"Yatırım");

        // Banka hesap bilgilerini ekrana yazdırma

        System.out.println("bankaHesabi = " + bankaHesabi);


    }


}
