package _29_Inheritance._01_Example;

// Kedi sınıfı
public class Kedi extends Hayvan {
    // Kedi sınıfının yapıcı metodu (_25_Constructor)
    public Kedi(String renk, int yas) {
        super(renk, yas);
    }

    // Kedi sınıfının miyavla metodu
    public void miyavla() {
        System.out.println("Kedi miyavladı!");
    }
}
