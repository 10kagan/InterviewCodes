package Chain50JavaCore;

public class EquilibriumIndex {
    public static int findEquilibriumIndex(int [] nums){
        if (nums == null || nums.length == 0) return -1;

        long totalSum = 0;

        for (int n : nums){
            totalSum += n;
        }

        long leftSum = 0;

        for (int i = 0; i < nums.length; i++){
            long rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum){
                return nums[i];
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findEquilibriumIndex(new int[]{1, 3, 5, 2, 2})); // 2
        System.out.println(findEquilibriumIndex(new int[]{1, 2, 3}));       // -1
        System.out.println(findEquilibriumIndex(new int[]{2, 0, 0}));       // 0 (sol=0, sağ=0)
    }
}

// Find the equilibrium index of an array