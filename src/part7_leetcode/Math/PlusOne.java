package part7_leetcode.Math;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {1,2,9};

        /*
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
         */
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the least significant digit to the most significant digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by one
            digits[i]++;

            // If the digit becomes 10, set it to 0 and carry over the one to the next digit
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // No carry over, so we can return the digits array
                return digits;
            }
        }
        // If we reach here, it means all digits were 9, so we need to add an additional digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the most significant digit to 1
        return result;
    }
}
