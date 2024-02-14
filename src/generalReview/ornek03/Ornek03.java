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

        float totalAmount = 0, kilogram;

        Scanner input = new Scanner(System.in);

        Map<String, Float> fruits = new LinkedHashMap<>();
        fruits.put("Armut", 12.14f);
        fruits.put("Elma", 23.67f);
        fruits.put("Domates", 21.11f);
        fruits.put("Muz", 10.95f);
        fruits.put("Patlıcan", 25.00f);

        for (Map.Entry<String, Float> fruit : fruits.entrySet()) {
            System.out.print("Kaç kilo " + fruit.getKey() + "? :");
            kilogram = input.nextFloat();
            totalAmount = totalAmount + kilogram * fruit.getValue();
            System.out.println("Ara Toplam: ");
        }
    }
}
