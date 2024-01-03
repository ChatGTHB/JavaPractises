package arrays2D;

public class _02_Example {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, // 1. satır
                          {4, 5, 6}, // 2. satır
                          {7, 8, 9}};// 3. satır
        // matrix'in 2. satırındaki (index sırası değil) tüm elemanları ekrana yazdırın.

        for (int i = 0; i < matrix[1].length; i++) {
            System.out.print(matrix[1][i] + " ");
        }

        // System.out.print(Arrays.toString(matrix[1]));
    }
}
