package part11_LeetcodeString;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        int n = 4;
//        Output: "pppz"
//        Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
        System.out.println(generateTheString(n));
    }
    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                sb.append('a');
            }
            sb.append('b');
        } else {
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        }
        return sb.toString();
    }
}

//97 - 122
 /*
         StringBuffer str = new StringBuffer();
        Map<Character, Integer> charMap = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < n; i++){
            char c = (char) ('a' + random.nextInt(26));
            if (!charMap.containsKey(c)){
                charMap.put(c, 1);
            } else {
                int d = charMap.get(c);
                charMap.put(c, d + 1);
            }
            str.append(c);
        }
        System.out.println(charMap);
        return str.toString();

  */

 /*
 Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.



Example 1:

Input: n = 4
Output: "pppz"
Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
Example 2:

Input: n = 2
Output: "xy"
Explanation: "xy" is a valid string since the characters 'x' and 'y' occur once. Note that there are many other valid strings such as "ag" and "ur".
  */