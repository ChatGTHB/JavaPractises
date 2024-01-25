package inheritance.ornek01;

// Köpek sınıfı oluşturuldu
public class Kopek extends Hayvan {
    String tasma;

    // Constructor oluşturuldu
    public Kopek(String renk, int yas, String tasma) {
        super(renk, yas);
        this.tasma = tasma;
    }

    // Köpek sınıfının havla methodu oluşturuldu
    public void havla() {
        System.out.println("Köpek havladı!");
    }
}
