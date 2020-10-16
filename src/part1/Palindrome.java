package part1;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kazakl"));
    }

    public static boolean isPalindrome(String str){
        boolean result = true;

        for (int i = 0, j =1 ; i < str.length()/2; i++, j++) {
            if (str.charAt(i) != str.charAt(str.length() - j)) {
                result = false;
            }
        }
        return result;
    }
}
