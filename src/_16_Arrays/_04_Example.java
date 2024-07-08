package _16_Arrays;

import java.util.Arrays;

public class _04_Example {
    public static void main(String[] args) {
        // Soru: Bir integer dizisini küçükten büyüğe sıralayan bir program yazın.

        // Örnek bir dizi tanımlayalım
        int[] numbers = {25, 17, 31, 13, 2};

        // Diziyi sırala
        Arrays.sort(numbers); // Java'nın hazır sıralama yöntemini kullanıyoruz

        // Sıralanmış diziyi yazdır
        System.out.print("Sıralanmış dizi: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
