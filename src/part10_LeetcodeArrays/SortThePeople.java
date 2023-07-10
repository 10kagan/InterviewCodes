package part10_LeetcodeArrays;

import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
        String [] names = {"Mary","John","Emma"};
        int [] heights = {180,165,170};
//        Output: ["Mary","Emma","John"]
//        Explanation: Mary is the tallest, followed by Emma and John.
        System.out.println(Arrays.deepToString(sortPeople(names, heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    // Swap heights
                    int tempHeight = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeight;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        return names;
    }
}
