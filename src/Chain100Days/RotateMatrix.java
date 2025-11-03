package Chain100Days;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate90Clockwise(matrix);

        // Matrisin yeni halini yazdır
        printMatrix(matrix);
    }
    public static void rotate90Clockwise (int [][] matrix){
        int n = matrix.length;

        // 1. Transpose işlemi: satır ↔ sütun yer değiştirir
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++){
            int left = 0, right = n - 1;

            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left ++;
                right --;
            }
        }
    }
    public static void printMatrix (int [][] matrix){
        for (int [] row: matrix){
            for (int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// Rotate a 2D matrix (NxN) 90 degrees clockwise.
