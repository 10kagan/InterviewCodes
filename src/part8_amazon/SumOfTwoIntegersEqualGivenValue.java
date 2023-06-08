package part8_amazon;

import java.util.*;

public class SumOfTwoIntegersEqualGivenValue {
    public static void main(String[] args) {
        int [] nums = {5, 7, 1, 2, 8, 4, 3};
        int target = 9;

        List<List<Integer>> twoSumTarget = findTwoSum(nums, target);

        for (List<Integer> twoInts : twoSumTarget) {
            System.out.println(twoInts);
        }

    }
    public static List<List<Integer>> findTwoSum (int[] nums, int target){
        List<List<Integer>> pairs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(complement);
                pairs.add(pair);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return pairs;
    }
}
