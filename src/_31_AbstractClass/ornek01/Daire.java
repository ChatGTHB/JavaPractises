package _31_AbstractClass.ornek01;
// Daire classı oluşturuldu.
public class Daire extends GeometrikSekil{

    private double yaricap;

    public Daire(double yaricap){
        this.yaricap=yaricap;
    }

    // Abstract method override edilerek dairenin alanı hesaplandı.
    @Override
    public double alanHesapla(){
        return Math.PI * yaricap * yaricap ;
    }

}
