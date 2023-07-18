package part12_LeetcodeMath;

import java.util.ArrayList;
import java.util.List;

public class Maximum69Number {
    public static void main(String[] args) {
        int num = 9669;
//        Output: 9969
//        Explanation:
//        Changing the first digit results in 6669.
//        Changing the second digit results in 9969.
//        Changing the third digit results in 9699.
//        Changing the fourth digit results in 9666.
//        The maximum number is 9969.
        System.out.println(maximum69Number(num));
    }
    public static int maximum69Number (int num) {
        String numStr = Integer.toString(num);
        char[] digits = numStr.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
 /*
 You are given a positive integer num consisting only of digits 6 and 9.

 Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
  */