package part8_amazon;

import java.util.Arrays;

public class FindTheMissingNumberInTheArray {
    public static void main(String[] args) {
        int [] nums = {3, 7, 1, 2, 8, 4, 5, 10, 6};
        System.out.println(findMissingNumber(nums));
    }
    public static int findMissingNumber (int [] nums){
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] + 1 != nums[i + 1]){
                result = nums[i] + 1;
                break;
            }
        }
        return result;
    }
}

/*
Runtime Complexity: Linear, O(n)

Memory Complexity: Constant, O(1)

 */