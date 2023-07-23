package part11_LeetcodeString;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        String s = "abacbc";
//        Output: true
//        Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
        System.out.println(areOccurrencesEqual(s));
    }
    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int firstOccurrence = -1;
        for (int count : map.values()) {
            if (firstOccurrence == -1) {
                firstOccurrence = count;
            } else if (firstOccurrence != count) {
                return false;
            }
        }
        return true;
    }
}
