package part1;

public class UniquePalindrome {
    public static void main(String[] args) {
        System.out.println(up("abbamx"));
    }
    public static String up (String str){
        String palindrome = "";
        String withoutPalindrome = "";
        for(int i = 0; i < str.length() ; i++){
            for (int j = i+1; j < str.length()+1 ; j++) {
                palindrome = str.substring(i, j);
                if(palindrome.length()>2 && isPalindrome(palindrome)){
                    withoutPalindrome = str.replace(palindrome,"");
                }
            }
        }
        return withoutPalindrome;
    }
    public static boolean isPalindrome (String str){
                boolean result = true;

        for (int i = 0, j =1 ; i < str.length()/2; i++, j++) {
            if (str.charAt(i) != str.charAt(str.length() - j)) {
                result = false;
            }
        }
        return result;
    }
}
