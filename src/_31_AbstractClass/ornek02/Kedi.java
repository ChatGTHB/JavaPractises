package _31_AbstractClass.ornek02;

// Hayvan sınıfını genişleten Kedi adında bir sınıf tanımladık.
public class Kedi extends Hayvan{
// Tüy rengi adında bir özellik tanımladık.
    private final String tuyRengi;

    // Kedi sınıfının yapıcı metodu (_25_Constructor) oluşturuldu.
    // Kedi nesnesi oluşturulurken tüy rengi belirtilmelidir
    public Kedi(String tuyRengi) {
        this.tuyRengi = tuyRengi;
    }

    // Hayvan sınıfından miras alınan sesCikar metodu uygulandı.
    @Override
    public void sesCikar() {
        // Kedi ses çıkardığında "Miyav!.." yazdırılacak
        System.out.println("Miyav!...");
    }
}
