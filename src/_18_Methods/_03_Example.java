package _18_Methods;

public class _03_Example {

    /*
     * Soru 3: Bir sayının çift olup olmadığını kontrol eden bir metot yazın.
     * (Çift sayı: 2 ile tam bölünebilen sayı)
     */

    // Bir sayının çift olup olmadığını kontrol eden metot
    public static boolean isEven(int number) {
        // Sayının 2'ye bölümünden kalan 0 ise çift sayıdır.
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Metodu test etmek için bir sayı belirliyoruz.
        int number = 8;
        boolean result = isEven(number);
        // Sonucu ekrana yazdırıyoruz.
        System.out.println(number + " çift mi? " + result);
        // Metot kullanarak sayının çift olup olmadığını kontrol eden kodu tekrar tekrar yazmaktan kurtulduk.
    }
}

