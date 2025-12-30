package Chain50JavaCore;

public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        if (str == null || str.isEmpty()) return false;

        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("level")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}

// Check if a string is a palindrome