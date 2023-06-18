package part9_leetcode75.SlidingWindow;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        String  s = "abciiidef";
        int k = 3;
//        Output: 3
//        Explanation: The substring "iii" contains 3 vowel letters.

        System.out.println(maxVowels(s, k));
    }
    public static int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (isVowel(rightChar)) {
                count++;
            }

            if (right - left + 1 > k) {
                char leftChar = s.charAt(left);
                if (isVowel(leftChar)) {
                    count--;
                }
                left++;
            }

            maxCount = Math.max(maxCount, count);
            right++;
        }

        return maxCount;

    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
