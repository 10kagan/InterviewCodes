package part11_LeetcodeString;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }
        return letterCount.size() == 26;
    }
}
