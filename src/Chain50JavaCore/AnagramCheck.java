package Chain50JavaCore;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2){
        if (str1 == null || str2 == null) return false;

        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : str1.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()){
            if (!countMap.containsKey(c)){
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) < 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));      // true
        System.out.println(areAnagrams("hello", "world"));        // false
        System.out.println(areAnagrams("Dormitory", "Dirty room"));// true
    }
}

// Check if two strings are anagrams of each other