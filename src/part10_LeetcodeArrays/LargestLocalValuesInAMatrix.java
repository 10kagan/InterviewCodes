package part10_LeetcodeArrays;

import java.util.Arrays;

public class LargestLocalValuesInAMatrix {
    public static void main(String[] args) {
        int [][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
//        Output: [[9,9],[8,6]]
//        Explanation: The diagram above shows the original matrix and the generated matrix.
//                Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
        int[][] largestLocalValues = largestLocal(grid);
        for (int i = 0; i < largestLocalValues.length; i++) {
            for (int j = 0; j < largestLocalValues[i].length; j++) {
                System.out.print(largestLocalValues[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] largestLocal(int[][] grid) {
        int[][] largestLocalValues = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                int max = Integer.MIN_VALUE;
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        if (r >= 0 && r < grid.length && c >= 0 && c < grid[i].length) {
                            max = Math.max(max, grid[r][c]);
                        }
                    }
                }
                largestLocalValues[i][j] = max;
            }
        }
        return largestLocalValues;
    }
}
