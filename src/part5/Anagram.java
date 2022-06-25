package part5;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println("isAnagram1(str1, str2) = " + isAnagram1(str1, str2));
    }
    static boolean isAnagram1(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.toString(ch1).equals(Arrays.toString(ch2));
    }
    static String toLowerCase(String str){
        String lower = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (65 <= ch && ch <= 90){
                ch = (char) (ch + 32);
            }
            lower += ch;
        }
        return lower;
    }
}
