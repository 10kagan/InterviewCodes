package Chain100Days;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr)); // Output: 6
    }
    public static int maxSubArray(int [] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++){

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

// Find the subarray with the maximum sum (Kadane’s Algorithm).