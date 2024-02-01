package abstractClass.ornek02;

// main metodunun bulunduğu sınıf, programın başlangıç noktasıdır.
public class Ornek02 {
    // main metodu, programın çalıştırıldığı yerdir.
    public static void main(String[] args) {

        // Kopek nesnesi oluşturuldu
        // Cins olarak "Akita İnu" belirtildi
        Kopek kopek=new Kopek("Akita İnu");
        // Köpek nesnesinin sesCikar metodu çağrılıyor.
        // Köpek ses çıkardığında "Hav hav!" yazdırılıyor.
        kopek.sesCikar();

        // Kedi nesnesi oluşturuldu
        // Tüy rengi olarak "Siyah" belirtildi
        Kedi kedi =new Kedi("Siyah");
        // Kedi nesnesinin sesCikar metodu çağrılıyor.
        // Kedi ses çıkardığında "Miyav!" yazdırılıyor.
        kedi.sesCikar();
    }
}
