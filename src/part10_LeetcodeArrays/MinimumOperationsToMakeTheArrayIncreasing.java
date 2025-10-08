package part10_LeetcodeArrays;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {
        int [] nums = {1,1,1};
//        Output: 3
//        Explanation: You can do the following operations:
//        1) Increment nums[2], so nums becomes [1,1,2].
//        2) Increment nums[1], so nums becomes [1,2,2].
//        3) Increment nums[2], so nums becomes [1,2,3].
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int operations = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                operations += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return operations;
    }
}
