package Chain50JavaCore;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static Integer findMostFrequent (int[] nums){
        if (nums == null || nums.length == 0) return null;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        int maxCount = 0;
        Integer mostFrequent = null;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2};
        System.out.println(findMostFrequent(arr)); // 3
    }
}

// Find the most frequent element in an array using HashMap