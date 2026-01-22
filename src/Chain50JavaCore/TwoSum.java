package Chain50JavaCore;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static boolean hasPairWithSum(int[] nums, int target){
        if (nums == null || nums.length < 2) return false;

        Set<Integer> seen = new HashSet<>();

        for (int n : nums){
            int complement = target - n;

            if (seen.contains(complement)){
                System.out.println("Pair found: " + n + ", " + complement);
                return true;
            }
            seen.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        hasPairWithSum(arr, 9); // Pair found: 7, 2
    }
}

// Find a pair of elements that sum up to a given number