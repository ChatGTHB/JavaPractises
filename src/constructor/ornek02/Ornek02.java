package constructor.ornek02;

public class Ornek02 {

    public static void main(String[] args) {

        // İlk kitap nesnesi oluşturuluyor: "Sefiller" kitabı, yazarı Victor Hugo
        Kitap kitap1 = new Kitap("Sefiller", "Victor Hugo");
        kitap1.bilgileriGoster();

        System.out.println();

        // İkinci kitap nesnesi oluşturuluyor: İsim boş, yazarı Jules Verne, sayfa sayısı 500
        Kitap kitap2 = new Kitap("", "Jules Verne", 500);
        kitap2.bilgileriGoster();

        System.out.println();

        // Üçüncü kitap nesnesi oluşturuluyor: İsim ve yazar bilgisi belirtilmemiş
        Kitap kitap3 = new Kitap(null, null);
        kitap3.bilgileriGoster(); // Kitap bilgileri ekrana yazdırılıyor
    }
}
