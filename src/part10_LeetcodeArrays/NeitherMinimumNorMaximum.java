package part10_LeetcodeArrays;

import java.util.Arrays;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        int [] nums = {3,2,1,4};
//        Output: 2
//        Explanation: In this example, the minimum value is 1 and the maximum value is 4. Therefore, either 2 or 3 can be valid answers.
        System.out.println(findNonMinOrMax(nums));
    }
    public static int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);

        if (nums.length < 3 || nums[0] == nums[nums.length - 1]) {
            return -1;
        }
        return nums[1];
    }
}
 /*
 Given an integer array nums containing distinct positive integers, find and return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.

 Return the selected integer.
  */