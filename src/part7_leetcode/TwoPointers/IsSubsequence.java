package part7_leetcode.TwoPointers;

import java.util.HashSet;
import java.util.Set;

public class IsSubsequence {
    public static void main(String[] args) {
        String  s = "abc";
        String t = "ahbgdc";
        //Output: true
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < t.length(); i++){
            set.add(t.charAt(i));
        }
        for (int j = 0; j < s.length(); j++){
            if (!set.contains(s.charAt(j))){
                return false;
            }
        }
        return true;
    }

}
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of
"abcde" while "aec" is not).
 */

/*
    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        int i = 0, j = 0;

        // Iterate over both strings
        while (i < sLen && j < tLen) {
            // If characters match, move to the next character in s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Move to the next character in t
            j++;
        }

        // If all characters of s are matched, it is a subsequence
        return i == sLen;
    }

 */