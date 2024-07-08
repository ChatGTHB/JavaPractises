package _16_Arrays;

public class _01_Example {
    public static void main(String[] args) {
        // Soru: Bir integer dizisindeki en büyük ve en küçük elemanı bulan bir program yazın.

        // Örnek bir dizi tanımlayalım
        int[] numbers = {12, 35, 7, 19, 42, 5, 26};

        // İlk elemanı hem en büyük hem de en küçük olarak kabul ediyoruz
        int max = numbers[0];
        int min = numbers[0];

        // Diziyi dolaşarak en büyük ve en küçük elemanları buluyoruz
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Daha büyük bir eleman bulduk
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Daha küçük bir eleman bulduk
            }
        }

        // Sonuçları yazdırıyoruz
        System.out.println("En büyük eleman: " + max);
        System.out.println("En küçük eleman: " + min);
    }
}
