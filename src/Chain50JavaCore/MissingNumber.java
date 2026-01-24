package Chain50JavaCore;

public class MissingNumber {
    public static int findMissingNumber(int[] nums, int n){
        if (nums == null){
            throw new IllegalArgumentException("Array is null");
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int x : nums){
            actualSum += x;
        }
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(findMissingNumber(arr, 5)); // 4

    }
}

// Find the missing number in a range from 1 to n.