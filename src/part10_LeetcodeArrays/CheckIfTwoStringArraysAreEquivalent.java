package part10_LeetcodeArrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};
//        Output: true
//        Explanation:
//        word1 represents string "ab" + "c" -> "abc"
//        word2 represents string "a" + "bc" -> "abc"
//        The strings are the same, so return true.
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer w1 = new StringBuffer();
        StringBuffer w2 = new StringBuffer();

        for (String word : word1) {
            w1.append(word);
        }
        for (String word : word2) {
            w2.append(word);
        }
        return w1.toString().equals(w2.toString());
    }
}
