package Chain100Days;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));     // ➜ abc
        System.out.println(longestSubstring("bbbbb"));        // ➜ b
        System.out.println(longestSubstring("pwwkew"));       // ➜ wke
        System.out.println(longestSubstring("abcdabcde"));    // ➜ abcde
        System.out.println(longestSubstring(""));             // ➜ ""
    }
    public static String longestSubstring (String str){
        if (str == null || str.isEmpty()) return "";

        int start = 0;
        int maxLen = 0;
        int maxStart = 0;

        HashSet<Character> seen = new HashSet<>();

        int end = 0;

        while (end < str.length()){
            char currentChar = str.charAt(end);

            while (seen.contains(currentChar)){
                seen.remove(str.charAt(start));
                start++;
            }

            seen.add(currentChar);

            if (end - start + 1 > maxLen){
                maxLen = end - start + 1;
                maxStart = start;
            }
            end++;
        }
        return str.substring(maxStart, maxStart+maxLen);
    }
}
// Implement a function to find the longest substring without repeating characters.