package part10_LeetcodeArrays;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String []words = {"ad","bd","aaab","baa","badab"};
//        Output: 2
//        Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
        System.out.println(countConsistentStrings(allowed, words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;

        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[i].length(); j++){
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
