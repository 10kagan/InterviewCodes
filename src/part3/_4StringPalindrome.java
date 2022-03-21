package part3;

public class _4StringPalindrome {
    public static void main(String[] args) {
        String pal = "aaa";
        System.out.println(pal + " is a palindrome word: " + isPalindrome(pal));
    }
    public static boolean isPalindrome (String str){
        boolean result = true;
        for (int i = 0, j =1 ; i < str.length()/2; i++, j++) {
            if (str.charAt(i) != str.charAt(str.length() - j)) {
                result = false;
            }
        }        return result;
    }
}
