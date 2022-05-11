package part4.Arrays;

public class _28LargestSumSubarray {
    public static void main(String[] args) {
        int arr[] = { 1, 8, -3, -7, 2, 7, -1, -9 };
        _28LargestSumSubarray maxSum = new _28LargestSumSubarray();
        System.out.println("Largest sum continuous subarray is " + maxSum.dynamicProgramForMaxSubArray(arr));    }
    public static int dynamicProgramForMaxSubArray(int [] arr){
        int []result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            result[i] = Math.max(result[i - 1] + arr[i], arr[i]);
        }
        int maxSumArray = result[0];
        for (int j = 1; j  < result.length; j++){
            if (maxSumArray < result[j])
                maxSumArray = result[j];
        }
        return maxSumArray;
    }
}
