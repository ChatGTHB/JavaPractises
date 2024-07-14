package _18_Methods;

public class _05_Example {

    /*
     * Soru 5: Bir stringin palindrom olup olmadığını kontrol eden bir metot yazın.
     * (Palindrom: İleri ve geri okunduğunda aynı olan kelime)
     */

    // Bir stringin palindrom olup olmadığını kontrol eden metot
    public static boolean isPalindrome(String str) {
        // Stringi tersine çevirip karşılaştırmak için boş bir string oluşturuyoruz.
        String reversed = "";
        // Stringin karakterlerini tersten ekleyerek yeni string oluşturuyoruz.
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        // Orijinal string ile ters çevrilmiş stringi karşılaştırıyoruz.
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        // Metodu test etmek için bir kelime belirliyoruz.
        String word = "radar";
        boolean result = isPalindrome(word);
        // Sonucu ekrana yazdırıyoruz.
        System.out.println(word + " palindrom mu? " + result);
        // Metot kullanarak stringin palindrom olup olmadığını kontrol eden kodu tekrar tekrar yazmaktan kurtulduk.
    }
}
