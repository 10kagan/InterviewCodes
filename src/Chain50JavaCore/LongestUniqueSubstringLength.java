package Chain50JavaCore;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstringLength {
    public static int lengthOfLongestSubstring(String s){
        if (s == null || s.isEmpty()) return 0;

        Map<Character, Integer> lastIndex = new HashMap<>();
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++){
            char c = s.charAt(end);

            if (lastIndex.containsKey(c) && lastIndex.get(c) >= start){
                start = lastIndex.get(c) + 1;
            }
            lastIndex.put(c, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(""));         // 0
    }
}

// Find the length of the longest substring without repeating characters