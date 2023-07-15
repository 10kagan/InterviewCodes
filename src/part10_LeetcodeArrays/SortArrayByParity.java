package part10_LeetcodeArrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    public static void main(String[] args) {
        int [] nums = {3,1,2,4};
//        Output: [2,4,3,1]
//        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        evenList.addAll(oddList);

        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = evenList.get(i);
        }

        return sortedArray;
    }
}
