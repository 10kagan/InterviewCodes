package part9_leetcode75.HashMap_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4,6};
//        Output: [[1,3],[4,6]]
//        Explanation:
//        For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
//        For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

        System.out.println(findDifference(nums1, nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> diff1 = new ArrayList<>(set1);
        List<Integer> diff2 = new ArrayList<>(set2);

        diff1.removeAll(set2);
        diff2.removeAll(set1);

        result.add(diff1);
        result.add(diff2);

        return result;
    }
}
