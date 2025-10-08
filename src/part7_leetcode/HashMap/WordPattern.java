package part7_leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        //Output: true
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWordMap = new HashMap<>();
        Map<String, Character> wordToCharMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWordMap.containsKey(c)) {
                if (!charToWordMap.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWordMap.put(c, word);
            }

            if (wordToCharMap.containsKey(word)) {
                if (wordToCharMap.get(word) != c) {
                    return false;
                }
            } else {
                wordToCharMap.put(word, c);
            }
        }
        return true;
    }
}
