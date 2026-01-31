package Chain50JavaCore;

public class MaxProductOfTwo {
    public static long maxProductOfTwo (int [] nums){
        if (nums == null || nums.length == 2){
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : nums){
            if (n > max1){
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }
            if (n < min1){
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = 2;
            }
        }
        long productionMax = (long) max1 * max2;
        long productionMin = (long) min1 * min2;

        return Math.max(productionMax, productionMin);
    }

    public static void main(String[] args) {
        System.out.println(maxProductOfTwo(new int[]{5, 1, 9, 2}));          // 45
        System.out.println(maxProductOfTwo(new int[]{-10, -3, 5, 6}));       // 30
        System.out.println(maxProductOfTwo(new int[]{-10, -20, 1, 2, 3}));   // 200
    }
}

// Find the maximum product of two integers in an array.