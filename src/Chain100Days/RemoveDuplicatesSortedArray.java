package Chain100Days;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6, 6, 6};
        int[] unique = getUniqueElements(nums);

        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
    public static int[] getUniqueElements (int [] nums){
        if (nums == null || nums.length == 0) return new int[0];

        List<Integer> result = new ArrayList<>();
        result.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                result.add(nums[i]);
            }
        }

        int[] uniqueArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            uniqueArray[i] = result.get(i);
        }
        return uniqueArray;
    }
}
