package abstractClass.ornek02;
// Hayvan sınıfını genişleten Kopek adında bir sınıf tanımladık.
public class Kopek extends Hayvan{
    // Cins adında bir özellik tanımladık.
    private final String cins;

    // Köpek sınıfının yapıcı metodu (_25_Constructor) oluşturuldu.
    // Köpek nesnesi oluşturulurken cinsi belirtilmelidir
    public Kopek(String cins) {
        this.cins = cins;
    }

    // Hayvan sınıfından miras alınan sesCikar metodu uygulandı.
    @Override
    public void sesCikar() {
        // Köpek ses çıkardığında  "Hav hav!.." yazdırılacak
        System.out.println("Hav hav!..");
    }
}
