package part11_LeetcodeString;

import java.util.Map;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        String s = "egcfe";
//        Output: "efcfe"
//        Explanation: The minimum number of operations to make "egcfe" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "efcfe", by changing 'g'.
        System.out.println(makeSmallestPalindrome(s));
    }
    public static String makeSmallestPalindrome(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {

                if (s.charAt(i) < s.charAt(len - i - 1)) {
                    chars[len - i - 1] = s.charAt(i);
                } else {
                    chars[i] = s.charAt(len - i - 1);
                }
            }
        }
        return new String(chars);
    }
}

 /*
You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.

Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

Return the resulting palindrome string.


  */