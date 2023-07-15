package part10_LeetcodeArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfPairsInArray {
    public static void main(String[] args) {
        int [] nums = {1,3,2,1,3,2,2};
//        Output: [3,1]
//        Explanation:
//        Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
//        Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
//        Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
//        No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }
    public static int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int pairs = 0;
        int leftovers = 0;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            pairs += count / 2;
            leftovers += count % 2;
        }

        return new int[]{pairs, leftovers};
    }
}
