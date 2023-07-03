package part10_LeetcodeArrays;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
//    public static int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        Map<Integer, Integer> freqMap = new HashMap<>();
//
//        for (int num : nums) {
//            count += freqMap.getOrDefault(num, 0);
//            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//        }
}
