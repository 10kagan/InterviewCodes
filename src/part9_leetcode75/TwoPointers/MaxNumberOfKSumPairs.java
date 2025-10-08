package part9_leetcode75.TwoPointers;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int k = 5;
//        Output: 2
//        Explanation: Starting with nums = [1,2,3,4]:
//        - Remove numbers 1 and 4, then nums = [2,3]
//        - Remove numbers 2 and 3, then nums = []
//        There are no more pairs that sum up to 5, hence a total of 2 operations.

        System.out.println(maxOperations(nums, k));
    }
    public static int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;

        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;

    }
}
