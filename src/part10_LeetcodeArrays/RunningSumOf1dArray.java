package part10_LeetcodeArrays;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
