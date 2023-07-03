package part10_LeetcodeArrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        // Use two pointers to shuffle the elements
        int i = 0; // pointer for the first half of the array
        int j = n; // pointer for the second half of the array

        for (int k = 0; k < 2 * n; k++) {
            // Alternate between taking an element from the first half and the second half
            if (k % 2 == 0) {
                result[k] = nums[i];
                i++;
            } else {
                result[k] = nums[j];
                j++;
            }
        }
        return result;
    }
}
