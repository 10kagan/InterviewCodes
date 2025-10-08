package part9_leetcode75.HashMap_Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,3,3};
        //Output: true
        //Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);

        Set<Integer> occurrenceSet = new HashSet<>(map.values());
        return map.size() == occurrenceSet.size();
    }
}


//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

