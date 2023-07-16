package part11_LeetcodeString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
//        Output: 4
//        Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'R') {
                balance++;
            } else if (c == 'L') {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}
