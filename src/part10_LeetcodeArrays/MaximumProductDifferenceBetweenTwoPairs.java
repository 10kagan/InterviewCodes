package part10_LeetcodeArrays;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int [] nums = {5,6,2,7,4};
//        Output: 34
//        Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
//                The product difference is (6 * 7) - (2 * 4) = 34.
        System.out.println(maxProductDifference(nums));
    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
