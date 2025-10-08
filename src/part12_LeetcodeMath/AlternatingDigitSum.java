package part12_LeetcodeMath;

import java.util.ArrayList;
import java.util.List;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        int n = 521;
//        Output: 4
//        Explanation: (+5) + (-2) + (+1) = 4.
        System.out.println(alternateDigitSum(n));
    }
    public static int alternateDigitSum(int n) {
        int sum = 0;
        List<Integer> digits = new ArrayList<>();
        while (n > 0){
            int digit = n % 10;
            digits.add(digit);
            n = n / 10;
        }
        for (int i = 0; i < digits.size(); i++){
            if (i % 2 == 0){
                sum += digits.get(i);
            } else {
                sum -= digits.get(i);
            }
        }
        return sum;
    }
}
