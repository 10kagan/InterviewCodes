package Chain100Days;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));     // true
        System.out.println(areAnagrams("triangle", "integral")); // true
        System.out.println(areAnagrams("apple", "papel"));       // true
        System.out.println(areAnagrams("hello", "world"));       // false
        System.out.println(areAnagrams("race", "care "));        // false (boşluk var)

    }
    public static boolean areAnagrams (String str1, String str2){
        if (str1 == null || str2 == null) return false;

        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        char [] a = str1.toCharArray();
        char [] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}
// Check if two strings are anagrams of each other.