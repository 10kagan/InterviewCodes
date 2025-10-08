package part7_leetcode.ArrayString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountUniquesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        //Output: 5, nums = [0,1,2,3,4]
        System.out.println(countUniques(nums));
    }

    public static int countUniques(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> uniqueElements = new HashSet<>();

        // Iterate over the array and add each element to the set
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Return the size of the set, which represents the count of unique elements
        return uniqueElements.size();
    }
}
