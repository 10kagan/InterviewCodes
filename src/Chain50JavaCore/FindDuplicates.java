package Chain50JavaCore;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static Set<Integer> findDuplicates(int [] nums){

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        if (nums == null || nums.length == 0){
            return duplicates;
        }

        for (int n : nums){
            if (!seen.add(n)){
                duplicates.add(n);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};
        System.out.println(findDuplicates(arr)); // [1, 2, 3]
    }
}

// Find all duplicate elements in an array using Set