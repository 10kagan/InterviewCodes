package part4.DynamicProgramming;

public class CountMatrixPaths {
    public static void main(String[] args) {
        CountMatrixPaths cmp = new CountMatrixPaths();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int totalPathsRec = cmp.countMatrixPathsRec(matrix, 0,0);
        System.out.println("Total paths to reach top left to bottom right using recursion: "+totalPathsRec);

        int totalPaths = cmp.countMatrixPathsDynamicProgramming(matrix);
        System.out.println("Total paths to reach top left to bottom right using DP: "+totalPaths);
    }
    public int countMatrixPathsRec(int [][] matrix, int row, int col){
        if (row == matrix.length - 1 || col == matrix[0].length - 1)
            return 1;
        return countMatrixPathsRec(matrix, row + 1, col) + countMatrixPathsRec(matrix, row, col + 1);
    }
    public int countMatrixPathsDynamicProgramming(int [][] matrix){
        int dp[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < dp.length; i++){
            dp[0][i] = 1;
        }
        for (int i = 0; i < dp.length; i++){
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++){
            for (int j = 1; j < dp.length; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[matrix.length - 1][matrix[0].length - 1];
    }
}
