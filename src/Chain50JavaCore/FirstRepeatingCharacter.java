package Chain50JavaCore;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static Character firstRepeatingChar(String str){
        if (str == null || str.isEmpty()) return null;

        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()){
            if (seen.contains(c)){
                return c;
            }
            seen.add(c);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstRepeatingChar("aabccde")); // a
        System.out.println(firstRepeatingChar("abca"));    // a
        System.out.println(firstRepeatingChar("abcdef"));  // null
        System.out.println(firstRepeatingChar("swiss"));   // s
    }

}
