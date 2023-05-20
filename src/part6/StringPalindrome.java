package part6;

public class StringPalindrome {
    public static boolean isPalindrome(String str){
        boolean result = true;
        for (int i = 0, j = 1; i < str.length()/2; i++, j++){
            if (str.charAt(i) != str.charAt(str.length() - j))
                result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "godeliveradareviledog";
        String str2 = "Go deliver a dare vile dog";
        System.out.println(str1 + "is a palindrome: " + isPalindrome(str1));
    }
}