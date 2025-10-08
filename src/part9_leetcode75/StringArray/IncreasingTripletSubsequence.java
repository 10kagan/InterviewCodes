package part9_leetcode75.StringArray;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int [] nums = {2,1,5,0,4,6};
        //Output: true
        //Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

        System.out.println(increasingTriplet(nums));
    }
    public static boolean increasingTriplet(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i + 2] > nums[i + 1] && nums[i + 1] > nums[i])
                return true;
        }
        return false;
    }
}
