package part10_LeetcodeArrays;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,3};
//        Output: 58
//        Explanation: The odd-length subarrays of arr and their sums are:
//                [1] = 1
//                [4] = 4
//                [2] = 2
//                [5] = 5
//                [3] = 3
//                [1,4,2] = 7
//                [4,2,5] = 11
//                [2,5,3] = 10
//                [1,4,2,5,3] = 15
//        If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int subarraySum = 0;
            for (int j = i; j < n; j++) {
                subarraySum += arr[j];
                if ((j - i + 1) % 2 == 1) {
                    sum += subarraySum;
                }
            }
        }
        return sum;
    }
}
