package Chain50JavaCore;

public class SumAndAverage {
    public static double [] calculateSumAndAverage(int [] nums){
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        long sum = 0;

        for (int n : nums){
            sum += n;
        }
        double average = (double) sum / nums.length;

        return new double[]{sum, average};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        double [] result = calculateSumAndAverage(arr);
        System.out.println("Sum: " + (long) result[0]);
        System.out.println("Average: " + result[1]);
    }
}

// Calculate the sum and average of array elements