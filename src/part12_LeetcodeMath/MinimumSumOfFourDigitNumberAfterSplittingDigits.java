package part12_LeetcodeMath;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        int num = 2932;
//        Output: 52
//        Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
//                The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
        System.out.println(minimumSum(num));
    }
    public static int minimumSum(int num) {
        int n = num;
        int digit = 0;
        while (n > 0){
            n = n / 10;
            digit++;
        }
        int [] arr = new int[digit];

        for (int i = 0; i < digit; i++){
            arr[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);
        return arr[0] * 10 + arr[2] + arr[1] * 10 + arr[3];
    }
}
