package part9_leetcode75.StringArray;


public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
/*
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r
 */
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++){
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
