package _16_Arrays;

public class _03_Example {
    public static void main(String[] args) {
        // Task: Bir integer dizisindeki elemanları ters çeviren bir program yazın.

        // Örnek bir dizi tanımlayalım
        int[] numbers = {1, 2, 3, 4, 5};

        // Dizinin uzunluğunu alıyoruz
        int n = numbers.length;
        // Ters çevrilmiş dizi için yeni bir dizi tanımlıyoruz
        int[] reversed = new int[n];

        // Diziyi ters çeviriyoruz
        for (int i = 0; i < n; i++) {
            reversed[i] = numbers[n - 1 - i]; // Elemanları ters sırayla yeni diziye ekliyoruz
        }

        // Ters çevrilmiş diziyi yazdırıyoruz
        System.out.print("Ters çevrilmiş dizi: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
