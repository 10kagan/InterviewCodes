package part10_LeetcodeArrays;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//                Therefore only 12 and 7896 contain an even number of digits.
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            int digitNumber = 0;
            while (nums[i] > 0){
                nums[i] = nums[i] / 10;
                digitNumber++;
            }
            if (digitNumber % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
