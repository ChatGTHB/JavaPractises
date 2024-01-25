package encapsulation.ornek01;

public class Ornek01 {

    public static void main(String[] args) {

        Kisi hazar = new Kisi();

        hazar.ad = "Hazar"; // Kişi nesnesi oluşturuldu ve "ad" özelliği "Hazar" olarak atandı
        hazar.setYas(30); // "setYas" metodu kullanılarak "yas" özelliği 30 olarak ayarlandı.

        int yas = hazar.getYas(); // "getYas" metodu kullanılarak kişinin yaş değeri alındı
        System.out.println("Kişinin yaşı = " + yas); // Kişinin yaş değeri ekrana yazdırıldı
    }
}
