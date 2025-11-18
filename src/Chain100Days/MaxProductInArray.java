package Chain100Days;

import java.util.Arrays;

public class MaxProductInArray {
    public static void main(String[] args) {
        int[] nums = {-10, -20, 1, 3, 5, 7, 9};

        int maxProduct = findMaxProduct(nums);
        System.out.println("Maximum product of two integers: " + maxProduct);
    }
    public static int findMaxProduct(int [] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        Arrays.sort(arr);

        int n = arr.length;

        int product1 = arr[n - 1] * arr[n - 2];

        int product2 = arr[0] * arr[1];

        return Math.max(product1, product2);
    }
}

// Find the maximum product of two integers in an array.