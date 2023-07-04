package part10_LeetcodeArrays;

public class MaximumNumberOfWordsInSentences {
    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//        Output: 6
//        Explanation:
//        - The first sentence, "alice and bob love leetcode", has 5 words in total.
//                - The second sentence, "i think so too", has 4 words in total.
//                - The third sentence, "this is great thanks very much", has 6 words in total.
//                Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < sentences.length; i++){
            String[] words = sentences[i].split(" ");
            max = Math.max(max, words.length);
        }
        return max;
    }
}
