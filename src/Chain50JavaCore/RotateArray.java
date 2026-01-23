package Chain50JavaCore;

import java.util.Arrays;

public class RotateArray {

    public static void rotateRight(int nums[], int k){
        if (nums == null || nums.length == 0) return;

        int n = nums.length;
        k = k % n;
        if (k == 0) return;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int [] nums, int left, int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateRight(arr, 3);
        System.out.println(Arrays.toString(arr)); // [5, 6, 7, 1, 2, 3, 4]
    }
}

// Rotate an array to the right by k steps.