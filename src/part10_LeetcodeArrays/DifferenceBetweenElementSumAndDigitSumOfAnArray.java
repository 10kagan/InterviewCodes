package part10_LeetcodeArrays;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public static void main(String[] args) {
        int [] nums = {1,15,6,3};
//        Output: 9
//        Explanation:
//        The element sum of nums is 1 + 15 + 6 + 3 = 25.
//        The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
//        The absolute difference between the element sum and digit sum is |25 - 16| = 9.
        System.out.println(differenceOfSum(nums));
    }
    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++){
            elementSum += nums[i];

            while (nums[i] > 0){
                int digit = nums[i] % 10;
                nums[i] = nums[i] / 10;
                digitSum += digit;
            }
        }
        return elementSum - digitSum;
    }
}
