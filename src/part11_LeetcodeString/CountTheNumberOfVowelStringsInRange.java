package part11_LeetcodeString;

public class CountTheNumberOfVowelStringsInRange {
    public static void main(String[] args) {
        String [] words = {"hey","aeo","mu","ooo","artro"};
        int left = 1, right = 4;
//        Output: 3
//        Explanation:
//        - "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
//                - "mu" is not a vowel string because it does not start with a vowel.
//                - "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
//                - "artro" is a vowel string because it starts with 'a' and ends with 'o'.
//                The number of vowel strings in the mentioned range is 3.
        System.out.println(vowelStrings(words, left, right));
    }
    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";

        for (int i = left; i < right + 1; i++) {
            String word = words[i];
            if (vowels.contains(word.substring(0,1)) && vowels.contains(word.substring(words[i].length() - 1))) {
                count++;
                System.out.print(word.substring(0,1));
                System.out.println(word.substring(words[i].length() - 1));
            }
        }
        return count;
    }
}
