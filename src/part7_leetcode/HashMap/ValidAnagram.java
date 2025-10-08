package part7_leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        //Output: true
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the characters in string s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrement the character count for each character in string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            int count = charCountMap.get(c);
            if (count == 1) {
                charCountMap.remove(c);
            } else {
                charCountMap.put(c, count - 1);
            }
        }

        // If all characters in s and t are accounted for, it's an anagram
        return charCountMap.isEmpty();

    }

}
