package arrays2D;

public class _05_Example {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3}, // 1--> 1. sütun (0. index),   2--> 2. sütun (1. index), 3--> 3.sütun (2. index)
                {4, 5, 6}, // 4--> 1. sütun (0. index),   5--> 2. sütun (1. index), 6--> 3.sütun (2. index)
                {7, 8, 9}  // 7--> 1. sütun (0. index),   8--> 2. sütun (1. index), 9--> 3.sütun (2. index)
        };
        // matrix'in her bir sütunundaki elemanların toplamını ekrana yazdırın.
        // Her bir satırın sütun sayısı eşit. Her satırdaki aynı sütunların toplamını istiyoruz.

        for (int i = 0; i < matrix.length; i++) {
            int sutunToplam = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sutunToplam += matrix[j][i]; //sutunToplam = sutunToplam + matrix[j][i];
            }
            System.out.println("Sütun " + (i + 1) + " toplamı= " + sutunToplam);
        }
    }
}
