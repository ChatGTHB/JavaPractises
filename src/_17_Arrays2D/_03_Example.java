package _17_Arrays2D;

public class _03_Example {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // matrix'in 3. sütunlarındaki tüm elemanları ekrana yazdırın.

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][2] + " \n");
        }

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (j == 2) {
//                    System.out.println(matrix[i][j]);
//                }
//            }
//        }

    }
}
