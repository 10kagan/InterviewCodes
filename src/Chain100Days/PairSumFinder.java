package Chain100Days;

import java.util.HashSet;
import java.util.Set;

public class PairSumFinder {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 7, 8, 9};
        int target = 10;

        findPairsWithSum(nums, target);
    }
    public static void findPairsWithSum (int [] arr, int target){
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }
}

// Find the pair of elements that sum up to a given number.
