package _31_AbstractClass.ornek01;

// main methodun bulunduğu class oluşturuldu
public class Ornek01 {
    public static void main(String[] args) {

        // Dikdörtgen ve Daire classlarından nesneler oluşturuldu ve alanları hesaplandı

        Dikdortgen dikdortgen=new Dikdortgen(5,3);
        double dikdortgenAlan= dikdortgen.alanHesapla();
        System.out.println("dikdortgenAlan = " + dikdortgenAlan);

        Daire daire=new Daire(4);
        double daireAlan=daire.alanHesapla();
        System.out.println("daireAlan = " + daireAlan);
    }
}
