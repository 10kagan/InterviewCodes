package part10_LeetcodeArrays;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
//        Output: 8
//        Explanation: There are 8 negatives number in the matrix.
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
