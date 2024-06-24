package _07_StringMethods;

public class _01_Example {

    public static void main(String[] args) {

        String str = "Merhaba";

        //toLowerCase():Tüm harfleri küçük harfe çevirir.
        String kucukHarf = str.toLowerCase();
        System.out.println("kucukHarf = " + kucukHarf);

        //toUpperCase():Tüm harfleri büyük harfe çevirir.
        String buyukHarf = str.toUpperCase();
        System.out.println("buyukHarf = " + buyukHarf);

        // concat() metodu ile iki stringi birleştirme
        String str1 = "Merhaba";
        String str2 = "Dünya";
        String str3 = " ";

        String birlesikConcat = str1.concat(str3).concat(str2);
        System.out.println("birlesikConcat = " + birlesikConcat);

        // indexOf metodu, bir String içinde belirli bir alt dizenin ilk indeksini bulmaya yarayan bir Java metodu.
        // Eğer alt dize bulunamazsa, -1 değerini döndürür.

        String ornekString1 = "Merhaba Dünya";
        int index1 = ornekString1.indexOf("a");
        System.out.println("index1 = " + index1);

        int index2 = ornekString1.indexOf("a", index1 + 1);
        System.out.println("index2 = " + index2);
    }
}