package part10_LeetcodeArrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int [] nums = {1,2,3,2};
//        Output: 4
//        Explanation: The unique elements are [1,3], and the sum is 4.
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        int sum = 0;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
