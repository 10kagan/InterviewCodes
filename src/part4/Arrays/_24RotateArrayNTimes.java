package part4.Arrays;

import java.util.Arrays;

public class _24RotateArrayNTimes {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 2;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }
    public static int[] rotate(int [] nums, int k){
        int n = nums.length;
        if (k > n)
            k = k % n;
        nums = reverse(nums, 0, n - 1);
        nums = reverse(nums, 0, k - 1);
        nums = reverse(nums, k, n - 1);
        return nums;
    }
    public static int[] reverse (int [] nums, int start, int end){
        while (start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
        return nums;
    }
}
