package part7_leetcode.ArrayString;

import java.util.Arrays;

public class RotataArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k if it's larger than the array size

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        //reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move the indices towards the middle
            start++;
            end--;
        }
    }
}
