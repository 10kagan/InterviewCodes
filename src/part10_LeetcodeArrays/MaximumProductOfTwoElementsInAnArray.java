package part10_LeetcodeArrays;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int [] nums = {3,4,5,2};
//        Output: 12
//        Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);

        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
