package part10_LeetcodeArrays;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int [] nums = {2,5,6,9,10};
//        Output: 2
//        Explanation:
//        The smallest number in nums is 2.
//        The largest number in nums is 10.
//        The greatest common divisor of 2 and 10 is 2.
        System.out.println(findGCD(nums));
    }
    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return gcd(min, max);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
