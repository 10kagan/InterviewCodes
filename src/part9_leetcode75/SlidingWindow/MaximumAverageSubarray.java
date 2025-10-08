package part9_leetcode75.SlidingWindow;

import java.util.Arrays;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
//        Output: 12.75000
//        Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
        System.out.println(findMaxAverage(nums, k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double result = 0.0;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        result = (double) sum / k;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            result = Math.max(result, (double) sum / k);
        }

        return result;
    }

}
