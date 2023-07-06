package part10_LeetcodeArrays;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
//        Output: [2,4,4,4]
//        Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
//                The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
//        At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }
    public static int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 ==1){
                len += nums[i];
            }
        }
        int [] encoded = new int[len];
        int index = 0;

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                encoded[index++] = val;
            }
        }
        return encoded;
    }
}
