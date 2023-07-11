package part10_LeetcodeArrays;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
//        Output: "ada"
//        Explanation: The first string that is palindromic is "ada".
//                Note that "racecar" is also palindromic, but it is not the first.
        System.out.println(firstPalindrome(words));
    }
    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++){
            boolean isPalindrome = true;
            for (int j = 0, k = words[i].length() - 1; j < words[i].length() / 2; j++, k--) {
                if (words[i].charAt(j) != words[i].charAt(k)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                return words[i];
            }
        }
        return "";
    }
}
