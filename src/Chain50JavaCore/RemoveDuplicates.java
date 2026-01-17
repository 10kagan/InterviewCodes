package Chain50JavaCore;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0) return new int[0];

        int write = 1;

        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[read - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }
        return Arrays.copyOf(nums, write);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}

// Remove duplicates from a sorted array and return unique elements