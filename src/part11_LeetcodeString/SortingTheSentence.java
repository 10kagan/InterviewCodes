package part11_LeetcodeString;

import java.util.ArrayList;
import java.util.List;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
//        Output: "This is a sentence"
//        Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String [] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            sortedWords[index] = word.substring(0, word.length() - 1);
        }

        StringBuffer sortedSentence = new StringBuffer();

        for (int i = 0; i < sortedWords.length; i++) {
            sortedSentence.append(sortedWords[i]);
            if (i < sortedWords.length - 1) {
                sortedSentence.append(" ");
            }
        }
        return sortedSentence.toString();
    }
}
