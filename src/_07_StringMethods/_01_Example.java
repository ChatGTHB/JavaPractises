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

        // lastIndexOf metodu, bir String içinde belirli bir alt dizenin en son bulunduğu indeksi bulmaya yarayan bir Java metodu.
        // Bu metot, alt dizenin sondan başlayarak aranmasını sağlar. Eğer alt dize bulunamazsa, -1 değerini döndürür.

        String ornekString2 = "Merhaba Dünya, Merhaba Java 26";
        int index3 = ornekString2.lastIndexOf("Merhaba");
        System.out.println("index3 = " + index3);
        System.out.println("ornekString2.lastIndexOf(\"a\") = " + ornekString2.lastIndexOf("a"));
        System.out.println("ornekString2.indexOf(\"26\") = " + ornekString2.indexOf("26"));
        System.out.println("ornekString2.lastIndexOf(\"26\") = " + ornekString2.lastIndexOf("26"));

        // isEmpty metodu, bir String'in boş olup olmadığını kontrol etmek için kullanılır.
        // Eğer string boş ise true, değilse false döndürür.

        String bosString = "";
        String doluString = "Merhaba";

        boolean bosMu1 = bosString.isEmpty();
        boolean bosMu2 = doluString.isEmpty();

        System.out.println("bosMu1 = " + bosMu1);
        System.out.println("bosMu2 = " + bosMu2);

        // trim metodu, bir String'in başındaki ve sonundaki boşlukları (whitespace karakterleri) temizlemek için kullanılır.
        // Whitespace karakterleri, boşluk, tab, yeni satır gibi görünmeyen karakterleri içerir.

        String ornekTrim = "     Merhaba, Bu bir örnek!    ";
        System.out.println("ornekTrim = " + ornekTrim);

        String temizlenmisTrim = ornekTrim.trim();
        System.out.println("temizlenmisTrim = " + temizlenmisTrim);

        // contains metodu, bir String'in belirli bir alt dizeyi içerip içermediğini kontrol etmek için kullanılır.
        // Eğer belirtilen alt dize string içinde bulunuyorsa, true değerini döndürür; aksi takdirde, false değerini döndürür.

        String ornekContains = "Merhaba, bu bir contains örneğidir!";
        boolean iceriyorMu1 = ornekContains.contains("örneğidir!");
        boolean iceriyorMu2 = ornekContains.contains("testing");
        System.out.println("iceriyorMu1 = " + iceriyorMu1);
        System.out.println("iceriyorMu2 = " + iceriyorMu2);

        // equals metodu, iki String nesnesinin içeriğini karşılaştırmak için kullanılır.
        // Eğer iki stringin içeriği birbirine eşitse, yani aynı karakterlere ve sıraya sahiplerse, true değerini döndürür;
        // aksi takdirde, false değerini döndürür.

        String string1="Merhaba";
        String string2="Merhaba";
        String string3="MERHABA";

        boolean ayniMı1=string1.equals(string2);
        System.out.println("ayniMı3 = " + ayniMı1);

        boolean ayniMı2=string1.equals(string3);
        System.out.println("ayniMı4 = " + ayniMı2);

        // equalsIgnoreCase metodu, iki String nesnesinin içeriğini karşılaştırmak için kullanılır,
        // ancak büyük/küçük harf duyarlılığını göz ardı eder. Yani, iki stringin içeriği aynı karakterlere sahipse
        // ve harf büyüklük küçüklükleri farklı olsa bile, true değerini döndürür; aksi takdirde, false değerini döndürür.

        String string4="Merhaba";
        String string5="Merhaba";
        String string6="MERHABA";

        boolean ayniMı3=string4.equalsIgnoreCase(string5);
        System.out.println("ayniMı3 = " + ayniMı3);

        boolean ayniMı4=string4.equalsIgnoreCase(string6);
        System.out.println("ayniMı4 = " + ayniMı4);

        // length(): String'in uzunluğunu döndürür.(int)

        String str4 = "Merhaba";
        int strUzunluk = str4.length(); // 7
        System.out.println("strUzunluk = " + strUzunluk);

        // charAt(int index): Belirli bir dizindeki karakteri döndürür.

        char ilkKarakter = str4.charAt(0);
        char sonKarakter = str4.charAt(str4.length() - 1);


        System.out.println("ilkKarakter = " + ilkKarakter);
        System.out.println("sonKarakter = " + sonKarakter);

        // substring(int başlangıçIndex): Belirli bir dizinden sona kadar olan alt dizesini döndürür.

        String altDize1 = str4.substring(3);
        System.out.println("altDize1 = " + altDize1);

        // substring(int başlangıçIndex, int bitişIndex): Belirli bir aralıktaki alt dizesini döndürür.
        String altDize2 = str4.substring(0, 3);
        System.out.println("altDize2 = " + altDize2);

        //startsWith metodu, bir String'in belirli bir alt dize ile başlayıp başlamadığını kontrol etmek için kullanılır.
        //Bu metot, eğer bir String, belirli bir başlangıç alt dizisi ile başlıyorsa true, başlamıyorsa false değerini döndürür.
        String ornekStartWith = "Merhaba, Bu bir örnek!";

        // startsWith metodu ile bir alt dize ile başlayıp başlamadığını kontrol etme
        boolean basliyorMu1 = ornekStartWith.startsWith("Merhaba");
        boolean basliyorMu2 = ornekStartWith.startsWith("Java");

        // Sonuçları ekrana yazdırma
        System.out.println("\"Merhaba\" ile başlıyor mu? " + basliyorMu1); // true
        System.out.println("\"Java\" ile başlıyor mu? " + basliyorMu2); // false

        //endsWith metodu, bir String'in belirli bir alt dize ile bitip bitmediğini kontrol etmek için kullanılır.
        //Bu metot, eğer bir String, belirli bir bitiş alt dizisi ile bitiyorsa true, bitmiyorsa false değerini döndürür.

        String ornekEndWith = "Merhaba, Bu bir örnek!";

        // endsWith metodu ile bir alt dize ile bitip bitmediğini kontrol etme
        boolean bitiyorMu1 = ornekEndWith.endsWith("örnek!");
        boolean bitiyorMu2 = ornekEndWith.endsWith("Java");

        // Sonuçları ekrana yazdırma
        System.out.println("\"örnek!\" ile bitiyor mu? " + bitiyorMu1); // true
        System.out.println("\"Java\" ile bitiyor mu? " + bitiyorMu2); // false

        //replace metodu, bir String içinde belirli bir karakteri veya alt dizesini
        //başka bir karakter veya alt dize ile değiştirmek için kullanılır.

        String ornekReplace = "Merhaba, Bu bir örnek cümle.";

        // replace metodu ile belirli bir karakteri veya alt dizesini değiştirme
        String yeniString1 = ornekReplace.replace('e', 'X'); // 'e' karakterini 'X' ile değiştir
        String yeniString2 = ornekReplace.replace("örnek", "farklı"); // "örnek" alt dizesini "farklı" ile değiştir

        // Sonuçları ekrana yazdırma
        System.out.println("Orjinal String: " + ornekReplace);
        System.out.println("Karakter Değişimi: " + yeniString1);
        System.out.println("Alt Dize Değişimi: " + yeniString2);

        //replaceFirst metodu, bir String içinde belirli bir deseni (pattern) veya karakteri başka bir
        //desen veya karakterle değiştirmek için kullanılır. Ancak, sadece ilk bulunan eşleşmeyi değiştirir.
        String ornekReplaceFirst = "Merhaba, Bu bir örnek cümle. Merhaba dünya!";

        // replaceFirst metodu ile belirli bir deseni veya karakteri değiştirme
        String yeniString = ornekReplaceFirst.replaceFirst("Merhaba", "Selam");

        // Sonucu ekrana yazdırma
        System.out.println("Orjinal String: " + ornekReplaceFirst);
        System.out.println("İlk Desen Değişimi: " + yeniString);

        //replaceAll metodu, bir String içinde belirli bir deseni (regex ifadesini) veya karakteri başka bir desen
        //veya karakterle değiştirmek için kullanılır. Regex ifadeleri, desenlerin tanımlanması ve eşleşmelerin
        //bulunması için kullanılan özel ifadelerdir.

        String ornekReplaceAll = "Merhaba 123 dünya! Bu bir örnek cümle.";

        // replaceAll metodu ile regex kullanarak sayıları temizleme
        String temizlenmisHali = ornekReplaceAll.replaceAll("\\d", "");

        // Sonucu ekrana yazdırma
        System.out.println("Orjinal String: " + ornekReplaceAll);
        System.out.println("Sayıları Temizlenmiş String: " + temizlenmisHali);
    }
}