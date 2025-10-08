package part6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThreeSumZero {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> threeSumZero = threeSum(nums);

        System.out.println("Triplets with sum zero:");
        for (List<Integer> triplet : threeSumZero) {
            System.out.println(triplet);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array in ascending order
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates to avoid duplicates in the result
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates on the left side
                    while (left < right && nums[left] == nums[left + 1])
                        left++;

                    // Skip duplicates on the right side
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    // Move the pointers towards the middle
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}

