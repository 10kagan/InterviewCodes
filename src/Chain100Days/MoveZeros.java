package Chain100Days;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZerosToEnd(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
        public static void moveZerosToEnd(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;

        for (int num : nums){
            if (num != 0){
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length){
            nums[insertPos++] = 0;
        }
    }
}

// Move all zeros to the end of the array while maintaining the relative order.