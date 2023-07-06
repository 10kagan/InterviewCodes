package part10_LeetcodeArrays;

import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
//        Output: [0,4,1,3,2]
//        Explanation:
//        nums       index     target
//        0            0        [0]
//        1            1        [0,1]
//        2            2        [0,1,2]
//        3            2        [0,1,3,2]
//        4            1        [0,4,1,3,2]

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int [] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            for (int j = nums.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
