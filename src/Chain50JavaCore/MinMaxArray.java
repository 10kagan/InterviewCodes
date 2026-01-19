package Chain50JavaCore;

public class MinMaxArray {
    public static int[] findMinMax(int [] nums){
        if (nums == null || nums.length == 0){
            throw new  IllegalArgumentException("Array is empty or null");
        }

        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }

            if (nums[i] > max){
                max = nums[i];
            }
        }
        return new int[]{min,max};
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 7};

        int[] result = findMinMax(arr);
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
    }
}

// Find the minimum and maximum elements in an array