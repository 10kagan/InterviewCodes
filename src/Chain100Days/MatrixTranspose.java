package Chain100Days;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transposed = transposeMatrix(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(transposed);
    }
    public static int[][] transposeMatrix (int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int transposed [][] = new int[cols][rows];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public static void printMatrix(int [][] matrix){
        for (int [] row : matrix){
            for (int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

// Transpose a given matrix