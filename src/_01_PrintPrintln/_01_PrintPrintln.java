package _01_PrintPrintln;

public class _01_PrintPrintln {

    public static void main(String[] args) {

        // 1. Print ve Println

        // Task 1:
        // Konsola "Merhaba Dünya" yazdırın.

        System.out.println("Merhaba Dünya");
        System.out.print("Merhaba Dünya");


        //Task 2:
        //Konsola "Merhaba" ve "Dünya" kelimelerini aynı satırda yazdırın.

        // "Merhaba" kelimesini konsola yazdırır ve satır başını yapmaz.
        System.out.print("Merhaba ");
        // "Dünya" kelimesini konsola yazdırır ve satır başı yapar
        System.out.println("Dünya");


        // Task 3:
        // Konsola "Merhaba" ve "Dünya" kelimelerini farklı satırlarda yazdırın.

        // "Merhaba" kelimesini konsola yazdırır ve satır başını yapar.
        System.out.println("Merhaba");
        // "Dünya" kelimesini konsola yazdırır ve satır başı yapar
        System.out.println("Dünya");
    }
}