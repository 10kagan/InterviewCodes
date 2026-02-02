package Chain50JavaCore;

public class MajorityElement {
    public static int findMajorityElement(int [] nums){
        if (nums == null || nums.length == 0){
            throw new IllegalArgumentException("Array is null or empty");
        }

        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == candidate){
                count++;
            } else {
                count--;
            }
            if (count == 0){
                candidate = nums[i];
                count = 1;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{3,2,3}));         // 3
        System.out.println(findMajorityElement(new int[]{2,2,1,1,1,2,2})); // 2
    }
}

// Find the majority element in an array (appears more than n/2 times)