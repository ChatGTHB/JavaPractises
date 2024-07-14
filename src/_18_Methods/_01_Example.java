package _18_Methods;

public class _01_Example {

    /*
     * Soru 1: İki sayının farkını hesaplayan bir metot yazın.
     */

    // İki sayının farkını hesaplayan metot
    public static int subtract(int a, int b) {
        // Metot, iki parametre alır ve bu parametrelerin farkını döndürür.
        return a - b;
    }

    public static void main(String[] args) {
        // Metodu test etmek için iki sayı belirliyoruz.
        int result = subtract(10, 4);
        // Sonucu ekrana yazdırıyoruz.
        System.out.println("Fark: " + result);
        // Metot kullanmak kod tekrarını önler ve kodun okunabilirliğini artırır.
    }
}
