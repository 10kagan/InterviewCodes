package part11_LeetcodeString;

public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        String s = "ababa";
        System.out.println(removePalindromeSub(s));
    }
    public static int removePalindromeSub(String s) {
        if (s.isEmpty()) {
            return 0; // If the string is empty, we don't need to remove anything.
        } else if (isPalindrome(s)) {
            return 1; // If the string is already a palindrome, we can remove it in one step.
        } else {
            return 2; // Otherwise, we can remove all 'a's in one step and then all 'b's in the next step.
        }
    }
    public static boolean isPalindrome (String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
 /*
Input: s = "ababa"
Output: 1
Explanation: s is already a palindrome, so its entirety can be removed in a single step.
Example 2:

Input: s = "abb"
Output: 2
Explanation: "abb" -> "bb" -> "".
Remove palindromic subsequence "a" then "bb".
Example 3:

Input: s = "baabb"
Output: 2
Explanation: "baabb" -> "b" -> "".
Remove palindromic subsequence "baab" then "b".
  */