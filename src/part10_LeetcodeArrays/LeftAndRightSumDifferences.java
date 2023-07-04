package part10_LeetcodeArrays;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int [] nums = {10,4,8,3};
//        Output: [15,1,11,22]
//        Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
//        The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] answer = new int[n];

        // Compute left sum array
        for (int i = 0; i < n; i++) {
            leftSum[i] = (i == 0) ? nums[i] : leftSum[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(leftSum));
        // Compute right sum array
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                rightSum[i] = nums[i];
            } else {
                rightSum[i] = rightSum[i + 1] + nums[i];
            }
        }
        System.out.println(Arrays.toString(rightSum));
        // Compute the absolute differences between left and right sums
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}
