package inheritance.ornek01;

// Kedi sınıfı oluşturuldu
public class Kedi extends Hayvan {

    // Kedi sınıfının yapıcı methodu oluşturuldu. (constructor)
    public Kedi(String renk, int yas) {
        super(renk, yas);
    }

    // Miyavlama methodu eklendi
    public void miyavla() {
        System.out.println("Kedi miyavladı!");
    }
}
