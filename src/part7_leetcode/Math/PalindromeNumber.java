package part7_leetcode.Math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        //Output: true
        //Explanation: 121 reads as 121 from left to right and from right to left.
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }
        int reversed = 0;
        int original = x;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

}
