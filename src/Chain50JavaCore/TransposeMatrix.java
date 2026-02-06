package Chain50JavaCore;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix){
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transposed = transpose(matrix);

        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }
}

// Transpose a given matrix