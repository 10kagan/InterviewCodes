package Chain50JavaCore;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static Character firstNonRepeatingChar (String str){

        if (str == null || str.isEmpty()) return null;

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : str.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()){
            if (countMap.get(c) == 1){
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aabccde")); // b
        System.out.println(firstNonRepeatingChar("aabb"));    // null
        System.out.println(firstNonRepeatingChar("swiss"));   // w
    }
}

// Find the first non-repeating character in a string