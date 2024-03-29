package part10_LeetcodeArrays;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int [] nums = {1,2,2,1};
        int k = 1;
//        Output: 4
//        Explanation: The pairs with an absolute difference of 1 are:
//        - [1,2,2,1]
//        - [1,2,2,1]
//        - [1,2,2,1]
//        - [1,2,2,1]
        System.out.println(countKDifference(nums, k));
    }
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
