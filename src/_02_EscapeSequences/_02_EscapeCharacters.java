package _02_EscapeSequences;

public class _02_EscapeCharacters {

    public static void main(String[] args) {

        // Example 1:
        // "Merhaba\nDünya" yazdırın.

        // \n karakteri yeni bir satır başlatır.
        System.out.println("Merhaba\nDünya");
        /* Merhaba
           Dünya
         */

        // Example 2:
        // "Java\tProgramlama" yazdırın.

        // \t karakteri bir tab boşluğu ekler.
        System.out.println("Java\tProgramlama");
        // Java	Programlama

        // Example 3:
        // "Merhaba \"Dünya\"" yazdırın.

        // \" karakteri çift tırnak ekler.
        System.out.println("Merhaba \"Dünya\"");
        // Merhaba "Dünya"


        // Example 4:

        // \b: Backspace tusuna basma etkisi yani 1 karakter geri siler
        System.out.println("Java\b Programlama");
        // Jav Programlama

        // Example 5:

        // \r: Bulunduğu satırın başına gider
        System.out.println("Java\r Programlama");
        //  Programlama
    }
}
