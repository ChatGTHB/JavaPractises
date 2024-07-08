package _17_Arrays2D;

public class _04_Example {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
        // matrix'in her bir satırındaki elemanların toplamını ekrana yazdırın.

        for (int i = 0; i < matrix.length; i++) {
            int satirToplam = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                satirToplam += matrix[i][j]; //  satirToplam= satirToplam + matrix[i][j]
            }
            System.out.println("Satır " + (i+1) + " toplamı= " + satirToplam);
        }
    }
}
