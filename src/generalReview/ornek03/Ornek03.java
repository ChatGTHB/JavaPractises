package generalReview.ornek03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ornek03 {
    public static void main(String[] args) {

        /*
        Manav Kasa Programı

        Java ile kullanıcıların manavdan almış oldukları ürünlerin
        kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 12,14 TL
        Elma : 23,67 TL
        Domates : 21,11 TL
        Muz: 10,95 TL
        Patlıcan : 25,00 TL
         */

        float fiyat = 0, kilogram;

        Scanner input = new Scanner(System.in);

        Map<String, Float> meyveler = new LinkedHashMap<>();
        meyveler.put("Armut", 12.14f);
        meyveler.put("Elma", 23.67f);
        meyveler.put("Domates", 21.11f);
        meyveler.put("Muz", 10.95f);
        meyveler.put("Patlıcan", 25.00f);

        for (Map.Entry<String, Float> meyve : meyveler.entrySet()) {
            System.out.print("Kaç kilo " + meyve.getKey() + "? :");
            kilogram = input.nextFloat();
            // fiyat = fiyat + kilogram * meyve.getValue();
            fiyat += kilogram * meyve.getValue();
            System.out.printf("Ara Toplam = %.2f TL%n",fiyat);
        }
        System.out.printf("%nToplam Tutar = %.2f TL%n",fiyat);
    }
}
