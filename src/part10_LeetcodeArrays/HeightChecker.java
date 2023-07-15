package part10_LeetcodeArrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int [] heights = {1,1,4,2,1,3};
//        Output: 3
//        Explanation:
//        heights:  [1,1,4,2,1,3]
//        expected: [1,1,1,2,3,4]
//        Indices 2, 4, and 5 do not match.
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] sortedHeights = Arrays.copyOf(heights, heights.length);

        Arrays.sort(sortedHeights);
        for (int i = 0; i < heights.length; i++){
            if (heights[i] != sortedHeights[i]){
                count++;
            }
        }
        return count;
    }
}
