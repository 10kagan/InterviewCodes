package Chain100Days;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static Character firstNonRepeatingChar (String str){
        if (str == null || str.isEmpty()) return null;

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aabccdee"));   // ➜ b
        System.out.println(firstNonRepeatingChar("aabbcc"));     // ➜ null
        System.out.println(firstNonRepeatingChar("abcabcde"));   // ➜ d
        System.out.println(firstNonRepeatingChar(""));           // ➜ null
    }
}
