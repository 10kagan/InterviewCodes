package part7_leetcode.ArrayString;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums ={2,2,1,1,1,2,2};
        //Output: 2
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int majorityThreshold = nums.length / 2;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with count greater than the majority threshold
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > majorityThreshold) {
                return entry.getKey();
            }
        }
        // The majority element always exists, so this line should not be reached
        return -1;

    }

}





/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

*/