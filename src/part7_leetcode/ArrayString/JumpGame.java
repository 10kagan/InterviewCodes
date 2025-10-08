package part7_leetcode.ArrayString;

public class JumpGame {
    public static void main(String[] args) {
        int [] nums = {3,2,2,0,4};
        //Output: true
        //Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;

        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                // If the current index is not reachable, return false
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= n - 1) {
                // If the maximum reachable index is greater than or equal to the last index, return true
                return true;
            }
        }

        return false;
    }
}
