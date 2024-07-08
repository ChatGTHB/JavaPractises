package _16_Arrays;

public class _02_Example {
    public static void main(String[] args) {
        // Soru: Bir integer dizisindeki elemanların toplamını ve ortalamasını hesaplayan bir program yazın.

        // Örnek bir dizi tanımlayalım
        int[] numbers = {10, 20, 30, 40, 50};

        // Toplamı hesaplamak için bir değişken tanımlayalım
        int sum = 0;

        // Diziyi dolaşarak toplamı hesaplıyoruz
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Her elemanı toplama ekliyoruz
        }

        // Ortalamayı hesaplıyoruz
        double average = (double) sum / numbers.length;

        // Sonuçları yazdırıyoruz
        System.out.println("Toplam: " + sum);
        System.out.println("Ortalama: " + average);
    }
}
