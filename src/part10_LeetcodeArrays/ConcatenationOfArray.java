package part10_LeetcodeArrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int [] nums = {1,2,1};
//        Output: [1,2,1,1,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]

        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int[2 * len];

        for (int i = 0; i < len; i++) {
            result[i] = result[i + len] = nums[i];
        }
        return result;
    }
}
