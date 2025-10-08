package part7_leetcode.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String  s = "A man, a plan, a canal: Panama";
        //Output: true
        //Explanation: "amanaplanacanalpanama" is a palindrome.
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");
        s = s.replace(",", "");
        s = s.replace(":", "");

        boolean result = true;
        for (int i = 0, j = 1; i < s.length()/2; i++, j++){
            if (s.charAt(i) != s.charAt(s.length() - j))
                result = false;
        }
        return result;
    }
}
