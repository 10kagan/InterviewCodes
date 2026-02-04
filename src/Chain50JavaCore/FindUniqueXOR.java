package Chain50JavaCore;

public class FindUniqueXOR {
    public static int findUnique(int [] nums){
        if (nums == null ||  nums.length == 0){
            throw new IllegalArgumentException("Array is null or empty");
        }

        int result = 0;

        for (int n : nums){
            result ^= n; // XOR
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(findUnique(arr)); // 4
    }
}

// Find the unique element using XOR when all others appear twice