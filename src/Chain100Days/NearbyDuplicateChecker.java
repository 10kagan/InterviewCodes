package Chain100Days;

import java.util.HashSet;

public class NearbyDuplicateChecker {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3)); // true (1's are 3 apart)
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1)); // true
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2)); // false
    }
    public static boolean containsNearbyDuplicate(int [] nums, int k){
        if (k < 0 || nums == null || nums.length < 2) return false;

        HashSet<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (window.contains(nums[i])) return true;
            window.add(nums[i]);
            if (i >= k){
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}


// Check if an array contains duplicates within k indices apart.