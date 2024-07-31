package _18_Methods;

public class _04_Example {

    /*
     * Task 4: Bir dizideki en büyük değeri bulan bir metot yazın.
     */

    // Bir dizideki en büyük değeri bulan metot
    public static int maxValue(int[] numbers) {
        // İlk elemanı başlangıç değeri olarak al
        int max = numbers[0];
        // Dizi elemanlarını dolaş
        for (int number : numbers) {
            // Daha büyük bir değer bulunursa max değerini güncelle
            if (number > max) {
                max = number;
            }
        }
        // En büyük değeri döndür
        return max;
    }

    public static void main(String[] args) {
        // Metodu test etmek için bir dizi belirliyoruz.
        int[] myNumbers = {2, 4, 6, 8, 10};
        int max = maxValue(myNumbers);
        // Sonucu ekrana yazdırıyoruz.
        System.out.println("En büyük değer: " + max);
        // Metot kullanarak dizideki en büyük değeri bulma kodunu tekrar tekrar yazmaktan kurtulduk.
    }
}
