package part12_LeetcodeMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplitWithMinimumSum {
    public static void main(String[] args) {
        int num = 4325;
//        Output: 59
//        Explanation: We can split 4325 so that num1 is 24 and num2 is 35, giving a sum of 59. We can prove that 59 is indeed the minimal possible sum.
        System.out.println(splitNum(num));
    }
    public static int splitNum(int num) {
        int n = num;
        List<Integer> list = new ArrayList<>();

        while (n > 0){
            int digit = n % 10;
            list.add(digit);
            n = n / 10;
        }
        Collections.sort(list);
        int num1 = 0;
        int num2 = 0;

        boolean isNum1 = true;

        for (int i = 0; i < list.size(); i++) {
            if (isNum1) {
                num1 = num1 * 10 + list.get(i);
            } else {
                num2 = num2 * 10 + list.get(i);
            }
            isNum1 = !isNum1;
        }
        return num1 + num2;
    }
}
