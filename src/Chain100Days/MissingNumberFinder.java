package Chain100Days;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("Missing number: " + findMissingNumber(arr));
        // Output -> 3
    }
    public static int findMissingNumber (int [] nums){
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums){
            actualSum += num;

        }
        return expectedSum - actualSum;
    }
}
// Find the missing number in a sequence from 1 to N.