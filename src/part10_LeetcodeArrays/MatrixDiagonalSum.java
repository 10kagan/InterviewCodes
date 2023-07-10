package part10_LeetcodeArrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
//        Output: 25
//        Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//        Notice that element mat[1][1] = 5 is counted only once.
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i]; // Add the element from the primary diagonal
            sum += mat[i][mat.length - 1 - i]; // Add the element from the secondary diagonal
        }
        if (mat.length % 2 == 1) {
            int center = mat.length / 2;
            sum -= mat[center][center];
        }
        return sum;
    }
}
