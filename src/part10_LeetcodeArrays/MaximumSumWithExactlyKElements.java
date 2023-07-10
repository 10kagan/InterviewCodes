package part10_LeetcodeArrays;

public class MaximumSumWithExactlyKElements {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int k = 3;
//        Output: 18
//        Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
//                For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
//        For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
//        For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
//        So, we will return 18.
//        It can be proven, that 18 is the maximum answer that we can achieve.
        System.out.println(maximizeSum(nums, k));
    }
    public static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        for (int j = 0; j < k; j++){
            sum += max;
            max++;
        }
        return sum;
    }
}
