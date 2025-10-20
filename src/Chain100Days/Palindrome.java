package Chain100Days;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));      // true
        System.out.println(isPalindrome("radAr"));      // true
        System.out.println(isPalindrome("hello"));      // false
        System.out.println(isPalindrome("RaceCar"));    // false (case-sensitive)
        System.out.println(isPalindrome(""));           // true
    }
    public static boolean isPalindrome (String str){
        if (str == null) return false;

        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (right > left){
            if (str.charAt(left) != str.charAt(right))
                return false;

            right--;
            left++;
        }
        return true;
    }
}
