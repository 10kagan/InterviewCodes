package part9_leetcode75.HashMap_Set;

import java.util.Arrays;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        int [][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        //Output: 1
        //Explanation: There is 1 equal row and column pair:- (Row 2, Column 1): [2,7,7]

        int [][] grid2 = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
//        Output: 3
//        Explanation: There are 3 equal row and column pairs:
//        - (Row 0, Column 0): [3,1,2,2]
//        - (Row 2, Column 2): [2,4,2,2]
//        - (Row 3, Column 2): [2,4,2,2]

        System.out.println(equalPairs(grid2));
    }
    public static int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Arrays.equals(grid[i], getColumn(grid, j))) {
                    count++;
                }
            }
        }

        return count;
    }
    public static int[] getColumn(int[][] grid, int columnIndex) {
        int[] column = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            column[i] = grid[i][columnIndex];
        }
        return column;
    }
}
