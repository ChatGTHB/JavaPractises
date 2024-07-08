package _16_Arrays;

public class _05_Example {
    public static void main(String[] args) {
        // Soru: Bir integer dizisindeki her elemanın frekansını (kaç kere tekrarlandığını) bulan bir program yazın.

        // Örnek bir dizi tanımlayalım
        int[] numbers = {3, 5, 3, 2, 8, 5, 6, 3, 2};

        // Her bir elemanın frekansını tutmak için bir dizi tanımlıyoruz
        int[] frequency = new int[numbers.length];

        // Diziyi dolaşıyoruz
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    frequency[j] = -1; // Aynı elemanı tekrar saymamak için işaretliyoruz
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count; // Frekansı kaydediyoruz
            }
        }

        // Sonuçları yazdırıyoruz
        System.out.println("Elemanların frekansları:");
        for (int i = 0; i < numbers.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(numbers[i] + " sayısı " + frequency[i] + " kere tekrarlandı.");
            }
        }
    }
}
