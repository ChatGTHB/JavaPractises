package _18_Methods;

public class _02_Example {

    /*
     * Task 2: Bir sayının faktöriyelini hesaplayan bir metot yazın.
     * (Faktöriyel: Bir sayının 1'den başlayarak kendisine kadar olan tüm sayıların çarpımı)
     */

    // Bir sayının faktöriyelini hesaplayan metot
    public static int factorial(int n) {
        // Faktöriyel hesaplamak için başlangıç değeri 1
        int result = 1;
        // 1'den n'e kadar olan sayıları çarp
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        // Sonucu döndür
        return result;
    }

    public static void main(String[] args) {
        // Metodu test etmek için bir sayı belirliyoruz.
        int result = factorial(5);
        // Sonucu ekrana yazdırıyoruz.
        System.out.println("Faktöriyel: " + result);
        // Metot kullanarak faktöriyel hesaplama kodunu tekrar tekrar yazmaktan kurtulduk.
    }
}
