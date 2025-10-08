package part9_leetcode75.HashMap_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        String word1 = "abc",  word2 = "bca";
//        Output: true
//        Explanation: You can attain word2 from word1 in 2 operations.
//                Apply Operation 1: "abc" -> "acb"
//        Apply Operation 1: "acb" -> "bca"
/*Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
*/
        System.out.println(closeStrings(word1, word2));
    }
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            if (freq1[i] > 0) {
                set1.add(freq1[i]);
            }

            if (freq2[i] > 0) {
                set2.add(freq2[i]);
            }
        }

        return set1.equals(set2) && Arrays.equals(word1.chars().sorted().toArray(), word2.chars().sorted().toArray());
    }
}
