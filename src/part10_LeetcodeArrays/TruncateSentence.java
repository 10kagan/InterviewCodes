package part10_LeetcodeArrays;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
//        Output: "Hello how are you"
//        Explanation:
//        The words in s are ["Hello", "how" "are", "you", "Contestant"].
//        The first 4 words are ["Hello", "how", "are", "you"].
//        Hence, you should return "Hello how are you".
        System.out.println(truncateSentence(s, k));
    }
    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(words[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
