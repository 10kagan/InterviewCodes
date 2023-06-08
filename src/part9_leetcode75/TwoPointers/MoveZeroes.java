package part9_leetcode75.TwoPointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        //Output: [1,3,12,0,0]
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (right > left) {
            if (nums[left] == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
