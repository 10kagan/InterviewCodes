package part10_LeetcodeArrays;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,3};
        //Output: 3
        System.out.println(repeatedNTimes(nums));
    }
    public static int repeatedNTimes(int[] nums) {
        int repeated = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                repeated = entry.getKey();
                break;
            }
        }
        return repeated;
    }
}
